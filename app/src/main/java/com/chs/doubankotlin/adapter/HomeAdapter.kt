package com.chs.doubankotlin.adapter

import android.support.v7.widget.AppCompatRatingBar
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chs.doubankotlin.R
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.util.ImageLoader

/**
 *  作者：chs on 2017-11-29 10:25
 * 邮箱：657083984@qq.com
 */
class HomeAdapter(layoutResId: Int, data: MutableList<Home.SubjectsEntity>?) : BaseQuickAdapter<Home.SubjectsEntity, BaseViewHolder>(layoutResId, data) {

    override fun convert(helper: BaseViewHolder?, item: Home.SubjectsEntity?) {
        helper?.setText(R.id.tv_title, item?.title)
        helper?.setText(R.id.tv_rating, item?.rating?.average.toString())
        val ratingBar : AppCompatRatingBar = helper?.getView(R.id.rating_bar)!!
        ratingBar.rating = item?.rating?.average!!/2
        helper.setText(R.id.tv_person, "导演："+item.directors?.get(0)?.name)
        val builder = StringBuilder()
        for(item in item.casts!!){
            builder.append(item.name).append("/")
        }
        helper.setText(R.id.tv_des, "演员："+ builder.toString().substring(0,builder.toString().length-1))
        ImageLoader.loadImageView(mContext, item.images?.large!!, helper.getView(R.id.iv_pic)!!)
    }

}