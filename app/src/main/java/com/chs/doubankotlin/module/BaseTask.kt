package com.chs.doubankotlin.module

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *  作者：chs on 2017-11-30 14:46
 * 邮箱：657083984@qq.com
 */
open class BaseTask{
    protected fun <T> toSubscribe(o: Observable<T>?, observer: Observer<T>) {
        o?.subscribeOn(Schedulers.io())//指定Observable
                ?.unsubscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())//指定observer
                ?.subscribe(observer)
    }
}