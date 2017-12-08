package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-12-08 17:59
 * 邮箱：657083984@qq.com
 */
interface IHomeView : MvpView {
    fun setData(bean : Home)
    fun showLoading()
}