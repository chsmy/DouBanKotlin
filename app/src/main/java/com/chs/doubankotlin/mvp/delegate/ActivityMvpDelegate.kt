package com.chs.doubankotlin.mvp.delegate

import android.os.Bundle
import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-12-08 09:48
 * 邮箱：657083984@qq.com
 * 控制activity的生命周期
 */
interface ActivityMvpDelegate<in V: MvpView, out P: MvpPresenter<V>>{


    fun  onCreate(bundle: Bundle);

    fun onDestroy()

    fun onPause()

    fun onResume()

    fun onStart()

    fun onStop()

    fun onRestart()

    fun onSaveInstanceState(savedInstanceState : Bundle)

}