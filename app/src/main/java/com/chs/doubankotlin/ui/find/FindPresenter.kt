package com.chs.doubankotlin.ui.find

import com.chs.doubankotlin.module.FindTask
import com.chs.doubankotlin.module.bean.Find
import com.chs.doubankotlin.mvp.MvpBasePresenter
import com.chs.doubankotlin.mvp.MvpView
import io.reactivex.functions.Consumer

/**
 *  作者：chs on 2017-11-30 11:25
 * 邮箱：657083984@qq.com
 */
class FindPresenter<in V: MvpView>(view : FindContract.View) : MvpBasePresenter<V>() {

    var mView: FindContract.View? = null
    val mTask : FindTask by lazy {
       FindTask()
    }
    init {
        mView = view
    }
    override fun start() {
        super.start()
        mTask.getFindData(Consumer<Find> { t -> mView!!.setData(t) },0,9)
    }

}