package com.chs.doubankotlin.base

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver

/**
 *  作者：chs on 2017-11-30 14:26
 * 邮箱：657083984@qq.com
 */
abstract class BasePresenter : LifecycleObserver,BaseContract.Presenter{

    override fun start() {
    }

    override fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    override fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }

}