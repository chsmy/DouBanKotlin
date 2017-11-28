package com.chs.doubankotlin.ui.home

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import com.chs.doubankotlin.module.HomeTask
import com.chs.doubankotlin.module.bean.Home
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *  作者：chs on 2017-11-28 14:15
 * 邮箱：657083984@qq.com
 */
class HomePresenter : LifecycleObserver, HomeContract.Presenter {
    var mView: HomeContract.View? = null
    val mTask : HomeTask by lazy {
        HomeTask()
    }

    override fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    override fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }

    override fun start() {
        mTask.getHomeData( object :Observer<Home>{
            override fun onComplete() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSubscribe(d: Disposable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onNext(t: Home) {
                mView?.setData(t)
            }

            override fun onError(e: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        },0,10)
    }
}