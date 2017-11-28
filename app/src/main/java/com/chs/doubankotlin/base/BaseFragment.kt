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

    override lateinit var mPresenter : BaseContract.Presenter

    abstract fun initPresenter() : BaseContract.Presenter

    abstract fun init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = initPresenter()
        mPresenter.attachLifecycle(lifecycle)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(rootView == null){
            rootView = inflater?.inflate(getLayoutResources(),container,false)
        }
        return rootView
    }

    override fun onDestroy() {
        mPresenter.detachLifecycle(lifecycle)
        super.onDestroy()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
}