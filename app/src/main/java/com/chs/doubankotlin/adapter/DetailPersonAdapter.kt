package com.chs.doubankotlin.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chs.doubankotlin.module.bean.MovieDetail

/**
 *  作者：chs on 2017-12-05 17:46
 * 邮箱：657083984@qq.com
 */
class DetailPersonAdapter(layoutResId: Int, data: MutableList<MovieDetail.CastsEntity>?) : BaseQuickAdapter<MovieDetail.CastsEntity, BaseViewHolder>(data) {
    override fun convert(helper: BaseViewHolder?, item: MovieDetail.CastsEntity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}