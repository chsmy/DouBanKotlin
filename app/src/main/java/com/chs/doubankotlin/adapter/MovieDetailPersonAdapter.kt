package com.chs.doubankotlin.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chs.doubankotlin.R
import com.chs.doubankotlin.module.bean.MovieDetail
import com.chs.doubankotlin.util.ImageLoader

/**
 *  作者：chs on 2017-12-05 17:46
 * 邮箱：657083984@qq.com
 */
class MovieDetailPersonAdapter(layoutResId: Int, data: MutableList<MovieDetail.CastsEntity>?) : BaseQuickAdapter<MovieDetail.CastsEntity, BaseViewHolder>(layoutResId,data) {

    override fun convert(helper: BaseViewHolder?, item: MovieDetail.CastsEntity?) {
        helper!!.setText(R.id.tv_person_name,item!!.name)
        ImageLoader.loadImageView(mContext,item.avatars!!.medium!!,helper.getView(R.id.iv_person_head))
    }

}