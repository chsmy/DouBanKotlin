package com.chs.doubankotlin.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 *  作者：chs on 2017-11-29 15:31
 * 邮箱：657083984@qq.com
 */
class ImageLoader{
    companion object{
        //默认加载
        fun loadImageView(mContext: Context, path: String, mImageView: ImageView) {
            Glide.with(mContext).load(path).into(mImageView)
        }
    }
}