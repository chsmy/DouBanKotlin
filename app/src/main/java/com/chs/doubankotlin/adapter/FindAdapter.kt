package com.chs.doubankotlin.adapter

import com.chad.library.adapter.base.BaseSectionQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chs.doubankotlin.module.bean.FindSection

/**
 *  作者：chs on 2017-11-30 11:20
 * 邮箱：657083984@qq.com
 */
class FindAdapter(layoutResId: Int, sectionHeadResId: Int,data: MutableList<FindSection>?) :
        BaseSectionQuickAdapter<FindSection,BaseViewHolder>(layoutResId,sectionHeadResId,data){

    override fun convertHead(helper: BaseViewHolder?, item: FindSection?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convert(helper: BaseViewHolder?, item: FindSection?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}