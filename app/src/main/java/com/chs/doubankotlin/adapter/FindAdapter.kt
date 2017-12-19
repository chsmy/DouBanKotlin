package com.chs.doubankotlin.adapter

import com.chad.library.adapter.base.BaseSectionQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chs.doubankotlin.R
import com.chs.doubankotlin.module.bean.FindSection
import com.chs.doubankotlin.util.ImageLoader

/**
 *  作者：chs on 2017-11-30 11:20
 * 邮箱：657083984@qq.com
 */
class FindAdapter(layoutResId: Int, sectionHeadResId: Int,data: MutableList<FindSection>?) :
        BaseSectionQuickAdapter<FindSection,BaseViewHolder>(layoutResId,sectionHeadResId,data){

    override fun convertHead(helper: BaseViewHolder?, item: FindSection?) {
        helper?.setText(R.id.tv_title, item?.header)
        helper?.setVisible(R.id.tv_more, true)
        helper?.addOnClickListener(R.id.tv_more)
    }

    override fun convert(helper: BaseViewHolder?, item: FindSection?) {
        val entity = item?.t
        helper?.setText(R.id.tv_des, entity?.title)
        ImageLoader.loadImageView(mContext, entity?.images?.large,helper?.getView(R.id.iv_img))
    }

}