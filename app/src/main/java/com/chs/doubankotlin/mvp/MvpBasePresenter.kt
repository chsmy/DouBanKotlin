package com.chs.doubankotlin.mvp

import java.lang.ref.WeakReference





/**
 *  作者：chs on 2017-12-07 17:29
 * 邮箱：657083984@qq.com
 */
abstract class MvpBasePresenter< in V : MvpView> : MvpPresenter<V>{

    override fun start() {
    }
    private var viewRef: WeakReference<V>? = null
    private var presenterDestroyed = false


    override fun attachView(view: V) {
        viewRef = WeakReference<V>(view)
        presenterDestroyed = false
    }

    override fun detachView() {
        if(viewRef!=null){
            viewRef!!.clear()
            viewRef == null
        }
    }

    override fun destroy() {
        presenterDestroyed = true
    }

}