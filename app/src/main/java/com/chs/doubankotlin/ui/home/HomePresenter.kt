package com.chs.doubankotlin.ui.home

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.util.Log
import com.chs.doubankotlin.module.HomeTask
import com.chs.doubankotlin.module.bean.Home
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *  作者：chs on 2017-11-28 14:15
 * 邮箱：657083984@qq.com
 */
class HomePresenter(view : HomeContract.View) : LifecycleObserver, HomeContract.Presenter {
    var mView: HomeContract.View? = null
    val mTask : HomeTask by lazy {
        HomeTask()
    }
    init {
        mView = view
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
                Log.i("getHomeData","onComplete")
            }

            override fun onSubscribe(d: Disposable) {
                Log.i("getHomeData","onSubscribe")
            }

            override fun onNext(t: Home) {
                Log.i("getHomeData","onNext"+t.getTitle())
                mView?.setData(t)
            }

            override fun onError(e: Throwable) {
                Log.i("getHomeData","onError"+e.toString())
            }

        },0,10)
    }
}