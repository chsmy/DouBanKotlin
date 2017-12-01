package com.chs.doubankotlin.module

import com.chs.doubankotlin.module.bean.Find
import com.chs.doubankotlin.module.bean.FindSection
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.net.DataService
import com.chs.doubankotlin.net.RetrofitClient
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.BiFunction
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 *  作者：chs on 2017-11-30 14:45
 * 邮箱：657083984@qq.com
 */
class FindTask : BaseTask(){

    fun getFindData(observer: Consumer<Find>, start:Int, count:Int){
        val observable1 = RetrofitClient.getInstance().createReq(DataService::class.java)?.getTop250(start,count)
        observable1?.subscribeOn(Schedulers.io())?.unsubscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())

        val observable2 = RetrofitClient.getInstance().createReq(DataService::class.java)?.getNewMovie("0b2bdeda43b5688921839c8ecb20399b",start,count)
        observable2?.subscribeOn(Schedulers.io())?.unsubscribeOn(Schedulers.io())?.observeOn(AndroidSchedulers.mainThread())

        // object :BiFunction<Home, Home, Find>{ override fun apply(t1: Home, t2: Home): Find}
        Observable.zip(observable1,observable2, BiFunction<Home, Home, Find> { t1, t2 ->
            val find = Find()
            val movList = mutableListOf<FindSection>()
            movList.add(FindSection(true,"Top250"))
            t1.getSubjects()!!.mapTo(movList) { FindSection(it) }//mapTo 相当于for循环遍历
            movList.add(FindSection(true,"周榜"))
            t2.getSubjects()!!.mapTo(movList) { FindSection(it) }
            find.mSection = movList
            find
        }).subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }
}