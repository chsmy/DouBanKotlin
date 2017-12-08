package com.chs.doubankotlin.mvp.delegate

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView











/**
 *  作者：chs on 2017-12-08 15:40
 * 邮箱：657083984@qq.com
 */
class FragmentMvpDelegateImpl<in V: MvpView, out P: MvpPresenter<V>>
(fragment: Fragment, delegateCallback: MvpDelegateCallBack<V, P>) : FragmentMvpDelegate<V,P>{

    private val delegateCallback: MvpDelegateCallBack<V, P>? = delegateCallback

    private fun createViewIdAndCreatePresenter(): P {
        val presenter = delegateCallback!!.createPresenter()
        return presenter
    }

    override fun onCreate(saved: Bundle) {
       val presenter = createViewIdAndCreatePresenter();
        delegateCallback!!.setPresenter(presenter);
    }

    override fun onDestroy() {
        val presenter = getPresenter()
        presenter.attachView(getMvpView())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle) {
        val presenter = getPresenter()
        presenter.attachView(getMvpView())
    }

    override fun onDestroyView() {
    }

    override fun onPause() {
    }

    override fun onResume() {
    }

    override fun onStart() {
    }

    override fun onStop() {
    }

    override fun onActivityCreated(savedInstanceState: Bundle) {
    }

    override fun onAttach(activity: Activity) {
    }

    override fun onDetach() {
    }

    override fun onSaveInstanceState(outState: Bundle) {
    }

    private fun getPresenter(): P {
        return delegateCallback!!.getPresenter()
    }

    private fun getMvpView(): V {
        return delegateCallback!!.getMvpView()
    }

}