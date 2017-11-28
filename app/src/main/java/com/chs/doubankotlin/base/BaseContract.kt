package com.chs.doubankotlin.base

import android.arch.lifecycle.Lifecycle

/**
 *  作者：chs on 2017-11-28 10:33
 * 邮箱：657083984@qq.com
 */
interface BaseContract{

    interface View<T>{
      var presenter : T
    }
    interface Presenter {

        fun start();

        fun attachLifecycle(lifecycle: Lifecycle)

        fun detachLifecycle(lifecycle: Lifecycle)

//        fun attachView(view: BaseContract.View<Presenter>)
//
//        fun detachView()
    }
}