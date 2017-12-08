package com.chs.doubankotlin.ui.detail

import android.util.Log
import com.chs.doubankotlin.module.MovieDetailTask
import com.chs.doubankotlin.module.bean.MovieDetail
import com.chs.doubankotlin.mvp.MvpBasePresenter
import com.chs.doubankotlin.mvp.MvpView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *  作者：chs on 2017-12-04 15:45
 * 邮箱：657083984@qq.com
 */
class MovieDetailPresenter<in V:MvpView>(view : MovieDetailContract.View) : MvpBasePresenter<V>() {

    private var mView : MovieDetailContract.View? = null
    private val mTask : MovieDetailTask by lazy {
        MovieDetailTask()
    }
    init {
        mView = view
    }
    var id : String? = null
    override fun start() {
        super.start()
        mTask.getMovieDetail(object : Observer<MovieDetail>{
            override fun onComplete() {
                Log.i("getDetail","onComplete")
            }

            override fun onSubscribe(d: Disposable) {
                Log.i("getDetail","onSubscribe")
                mView!!.showLoading()
            }

            override fun onError(e: Throwable) {
                Log.i("getDetail","onError"+e.toString())
            }

            override fun onNext(t: MovieDetail) {
                Log.i("getDetail",t.getTitle())
                mView!!.setData(t)
            }

        },id)
    }

}