package com.chs.doubankotlin.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *  作者：chs on 2017-11-27 17:41
 * 邮箱：657083984@qq.com
 */
abstract class BaseFragment : Fragment(),BaseContract.View<BaseContract.Presenter>{

    var rootView : View? = null

    abstract fun getLayoutResources() : Int

    override lateinit var presenter : BaseContract.Presenter

    abstract fun initPresenter() : BaseContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = initPresenter()
        presenter.attachLifecycle(lifecycle)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(rootView == null){
            rootView = inflater?.inflate(getLayoutResources(),container,false)
        }
        return rootView
    }

    override fun onDestroy() {
        presenter.detachLifecycle(lifecycle)
        super.onDestroy()
    }
}