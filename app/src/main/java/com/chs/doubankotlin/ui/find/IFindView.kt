package com.chs.doubankotlin.ui.find

import com.chs.doubankotlin.module.bean.Find
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-12-11 09:56
 * 邮箱：657083984@qq.com
 */
interface IFindView : MvpView{
    fun setData(bean : Find)
    fun showLoading()
}