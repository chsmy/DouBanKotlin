package com.chs.doubankotlin.module

import com.chs.doubankotlin.module.bean.MovieDetail
import com.chs.doubankotlin.net.DataService
import com.chs.doubankotlin.net.RetrofitClient
import io.reactivex.Observer

/**
 *  作者：chs on 2017-12-04 15:52
 * 邮箱：657083984@qq.com
 */
class MovieDetailTask : BaseTask(){

    fun getMovieDetail(observer: Observer<MovieDetail> ,id : String?){
        val movieDetail = RetrofitClient.getInstance().createReq(DataService::class.java)!!.getMovieDetail(id!!)
        toSubscribe(movieDetail,observer)
    }

}