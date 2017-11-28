package com.chs.doubankotlin.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 *  作者：chs on 2017-11-28 09:54
 * 邮箱：657083984@qq.com
 */
abstract class BaseActivity : AppCompatActivity(),BaseContract.View<BaseContract.Presenter>{

     override lateinit var mPresenter : BaseContract.Presenter

     abstract fun initPresenter() : BaseContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mPresenter = initPresenter()
        mPresenter.attachLifecycle(lifecycle)
    }

    override fun onDestroy() {
        mPresenter.detachLifecycle(lifecycle)
        super.onDestroy()
    }
}