package com.chs.doubankotlin.ui.home

import android.util.Log
import com.chs.doubankotlin.module.HomeTask
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.mvp.MvpBasePresenter
import com.chs.doubankotlin.mvp.MvpView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *  作者：chs on 2017-11-28 14:15
 * 邮箱：657083984@qq.com
 */
class HomePresenter<in V:MvpView>(view : IHomeView) : MvpBasePresenter<V>() {
    var mView: IHomeView? = null
    val mTask : HomeTask by lazy {
        HomeTask()
    }
    init {
        mView = view
    }
    override fun start() {
        super.start()
        mTask.getHomeData( object :Observer<Home>{
            override fun onComplete() {
                Log.i("getHomeData","onComplete")
            }

            override fun onSubscribe(d: Disposable) {
                Log.i("getHomeData","onSubscribe")
                mView!!.showLoading()
            }

            override fun onNext(t: Home) {
                Log.i("getHomeData","onNext"+t.title)
                mView!!.setData(t)
            }

            override fun onError(e: Throwable) {
                Log.i("getHomeData","onError"+e.toString())
            }

        },0,10)
    }

    fun search(q:String){
        mTask.searchMovies( object :Observer<Home>{
            override fun onComplete() {
                Log.i("searchMovies","onComplete")
            }

            override fun onSubscribe(d: Disposable) {
                Log.i("searchMovies","onSubscribe")
                mView!!.showLoading()
            }

            override fun onNext(t: Home) {
                Log.i("searchMovies","onNext"+t.title)
                mView!!.setData(t)
            }

            override fun onError(e: Throwable) {
                Log.i("searchMovies","onError"+e.toString())
            }

        },q)
    }
}