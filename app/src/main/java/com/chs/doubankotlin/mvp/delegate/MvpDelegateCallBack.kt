package com.chs.doubankotlin.mvp.delegate

import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-12-08 10:17
 * 邮箱：657083984@qq.com
 */
interface MvpDelegateCallBack<V : MvpView,P:MvpPresenter<V>>{

    fun createPresenter():P

    fun getPresenter():P

    fun setPresenter(presenter:P)

    fun getMvpView() : V

}