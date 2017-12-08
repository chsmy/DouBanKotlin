package com.chs.doubankotlin.mvp.delegate

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView


/**
 *  作者：chs on 2017-12-08 15:38
 * 邮箱：657083984@qq.com
 */
interface FragmentMvpDelegate<in V: MvpView, out P: MvpPresenter<V>>{

    fun onCreate(saved: Bundle)


    fun onDestroy()


    fun onViewCreated(view: View, savedInstanceState: Bundle)


    fun onDestroyView()


    fun onPause()


    fun onResume()


    fun onStart()


    fun onStop()


    fun onActivityCreated(savedInstanceState: Bundle)


    fun onAttach(activity: Activity)


    fun onDetach()


    fun onSaveInstanceState(outState: Bundle)
}