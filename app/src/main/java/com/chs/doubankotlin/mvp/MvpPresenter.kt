package com.chs.doubankotlin.mvp

/**
 *  作者：chs on 2017-12-07 17:18
 * 邮箱：657083984@qq.com
 */
interface MvpPresenter<in V : MvpView>{

    fun start();

    fun attachView(view : V)

    fun detachView()

    fun destroy()
}