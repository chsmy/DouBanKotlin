package com.chs.doubankotlin.module

import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.net.DataService
import com.chs.doubankotlin.net.RetrofitClient
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *  作者：chs on 2017-11-28 16:23
 *  邮箱：657083984@qq.com
 */
class HomeTask{

    private fun <T> toSubscribe(o: Observable<T>, observer: Observer<T>) {
        o.subscribeOn(Schedulers.io())//指定Observable
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())//指定observer
                .subscribe(observer)
    }

    fun getHomeData(observer: Observer<Home>, start:Int ,count:Int){
        val observable = RetrofitClient.getInstance().createReq(DataService::class.java)?.getHomeData("0b2bdeda43b5688921839c8ecb20399b"
        ,"%E5%8C%97%E4%BA%AC",0,10,"","")
        toSubscribe(observable!!,observer)
    }

}