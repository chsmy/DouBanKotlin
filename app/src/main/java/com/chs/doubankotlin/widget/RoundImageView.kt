package com.chs.doubankotlin.widget

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.NinePatchDrawable
import android.util.AttributeSet
import com.chs.doubankotlin.R

/**
 *  作者：chs on 2017-12-01 17:44
 * 邮箱：657083984@qq.com
 */
class RoundImageView : android.support.v7.widget.AppCompatImageView {
    private var mBorderThickness = 0
    private var mContext: Context? = null
    private val defaultColor = -0x1
    // 如果只有其中一个有值，则只画一个圆形边框
    private var mBorderOutsideColor = 0
    private var mBorderInsideColor = 0
    // 控件默认长、宽
    private var defaultWidth = 0
    private var defaultHeight = 0

    constructor(context: Context) : super(context) {
        mContext = context
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        mContext = context
        setCustomAttributes(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        mContext = context
        setCustomAttributes(attrs)
    }

    private fun setCustomAttributes(attrs: AttributeSet) {
        val a = mContext!!.obtainStyledAttributes(attrs,
                R.styleable.roundedimageview)
        mBorderThickness = a.getDimensionPixelSize(
                R.styleable.roundedimageview_border_thickness, 0)
        mBorderOutsideColor = a
                .getColor(R.styleable.roundedimageview_border_outside_color,
                        defaultColor)
        mBorderInsideColor = a.getColor(
                R.styleable.roundedimageview_border_inside_color, defaultColor)
        a.recycle()
    }

    override fun onDraw(canvas: Canvas) {
        val drawable = drawable ?: return

        if (width == 0 || height == 0) {
            return
        }
        this.measure(0, 0)
        if (drawable.javaClass == NinePatchDrawable::class.java)
            return
        val b = (drawable as BitmapDrawable).bitmap
        val bitmap = b.copy(Bitmap.Config.ARGB_8888, true)
        if (defaultWidth == 0) {
            defaultWidth = width

        }
        if (defaultHeight == 0) {
            defaultHeight = height
        }
        // 保证重新读取图片后不会因为图片大小而改变控件宽、高的大小（针对宽、高为wrap_content布局的imageview，但会导致margin无效）
        // if (defaultWidth != 0 && defaultHeight != 0) {
        // LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
        // defaultWidth, defaultHeight);
        // setLayoutParams(params);
        // }
        var radius = 0
        if (mBorderInsideColor != defaultColor && mBorderOutsideColor != defaultColor) {// 定义画两个边框，分别为外圆边框和内圆边框
            radius = (if (defaultWidth < defaultHeight)
                defaultWidth
            else
                defaultHeight) / 2 - 2 * mBorderThickness
            // 画内圆
            drawCircleBorder(canvas, radius + mBorderThickness / 2,
                    mBorderInsideColor)
            // 画外圆
            drawCircleBorder(canvas, radius + mBorderThickness
                    + mBorderThickness / 2, mBorderOutsideColor)
        } else if (mBorderInsideColor != defaultColor && mBorderOutsideColor == defaultColor) {// 定义画一个边框
            radius = (if (defaultWidth < defaultHeight)
                defaultWidth
            else
                defaultHeight) / 2 - mBorderThickness
            drawCircleBorder(canvas, radius + mBorderThickness / 2,
                    mBorderInsideColor)
        } else if (mBorderInsideColor == defaultColor && mBorderOutsideColor != defaultColor) {// 定义画一个边框
            radius = (if (defaultWidth < defaultHeight)
                defaultWidth
            else
                defaultHeight) / 2 - mBorderThickness
            drawCircleBorder(canvas, radius + mBorderThickness / 2,
                    mBorderOutsideColor)
        } else {// 没有边框
            radius = (if (defaultWidth < defaultHeight)
                defaultWidth
            else
                defaultHeight) / 2
        }
        val roundBitmap = getCroppedRoundBitmap(bitmap, radius)
        canvas.drawBitmap(roundBitmap, (defaultWidth / 2 - radius).toFloat(), (defaultHeight / 2 - radius).toFloat(), null)
    }

    /**
     * 获取裁剪后的圆形图片
     *
     * @param radius
     * 半径
     */
    fun getCroppedRoundBitmap(bmp: Bitmap?, radius: Int): Bitmap {
        var bmp = bmp
        var scaledSrcBmp: Bitmap?
        val diameter = radius * 2

        // 为了防止宽高不相等，造成圆形图片变形，因此截取长方形中处于中间位置最大的正方形图片
        val bmpWidth = bmp!!.width
        val bmpHeight = bmp.height
        var squareWidth = 0
        var squareHeight = 0
        var x = 0
        var y = 0
        var squareBitmap: Bitmap?
        if (bmpHeight > bmpWidth) {// 高大于宽
            squareHeight = bmpWidth
            squareWidth = squareHeight
            x = 0
            y = (bmpHeight - bmpWidth) / 2
            // 截取正方形图片
            squareBitmap = Bitmap.createBitmap(bmp, x, y, squareWidth,
                    squareHeight)
        } else if (bmpHeight < bmpWidth) {// 宽大于高
            squareHeight = bmpHeight
            squareWidth = squareHeight
            x = (bmpWidth - bmpHeight) / 2
            y = 0
            squareBitmap = Bitmap.createBitmap(bmp, x, y, squareWidth,
                    squareHeight)
        } else {
            squareBitmap = bmp
        }

        if (squareBitmap!!.width != diameter || squareBitmap.height != diameter) {
            scaledSrcBmp = Bitmap.createScaledBitmap(squareBitmap, diameter,
                    diameter, true)

        } else {
            scaledSrcBmp = squareBitmap
        }
        val output = Bitmap.createBitmap(scaledSrcBmp!!.width,
                scaledSrcBmp.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(output)

        val paint = Paint()
        val rect = Rect(0, 0, scaledSrcBmp.width,
                scaledSrcBmp.height)

        paint.isAntiAlias = true
        paint.isFilterBitmap = true
        paint.isDither = true
        canvas.drawARGB(0, 0, 0, 0)
        canvas.drawCircle((scaledSrcBmp.width / 2).toFloat(),
                (scaledSrcBmp.height / 2).toFloat(), (scaledSrcBmp.width / 2).toFloat(),
                paint)
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(scaledSrcBmp, rect, rect, paint)
        // bitmap回收(recycle导致在布局文件XML看不到效果)
        // bmp.recycle();
        // squareBitmap.recycle();
        // scaledSrcBmp.recycle();
        bmp = null
        squareBitmap = null
        scaledSrcBmp = null
        return output
    }

    /**
     * 边缘画圆
     */
    private fun drawCircleBorder(canvas: Canvas, radius: Int, color: Int) {
        val paint = Paint()
        /* 去锯齿 */
        paint.isAntiAlias = true
        paint.isFilterBitmap = true
        paint.isDither = true
        paint.color = color
        /* 设置paint的　style　为STROKE：空心 */
        paint.style = Paint.Style.STROKE
        /* 设置paint的外框宽度 */
        paint.strokeWidth = mBorderThickness.toFloat()
        canvas.drawCircle((defaultWidth / 2).toFloat(), (defaultHeight / 2).toFloat(), radius.toFloat(), paint)
    }

}