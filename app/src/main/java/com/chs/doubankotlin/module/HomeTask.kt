package com.chs.doubankotlin.module

import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.net.DataService
import com.chs.doubankotlin.net.RetrofitClient
import io.reactivex.Observer

/**
 *  作者：chs on 2017-11-28 16:23
 *  邮箱：657083984@qq.com
 */
class HomeTask : BaseTask(){

    fun getHomeData(observer: Observer<Home>, start:Int ,count:Int){
        val observable = RetrofitClient.getInstance().createReq(DataService::class.java)?.getHeatMovie(start,count)
        toSubscribe(observable,observer)
    }

    fun searchMovies(observer: Observer<Home> ,q:String){
        val observable = RetrofitClient.getInstance().createReq(DataService::class.java)?.searchMovies(q)
        toSubscribe(observable,observer)
    }
}