package com.chs.doubankotlin.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 *  作者：chs on 2017-11-28 09:54
 * 邮箱：657083984@qq.com
 */
abstract class BaseActivity : AppCompatActivity(),BaseContract.View<BaseContract.Presenter>{

     override lateinit var presenter : BaseContract.Presenter

     abstract fun initPresenter() : BaseContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        presenter = initPresenter()
        presenter.attachLifecycle(lifecycle)
    }

    override fun onDestroy() {
        presenter.detachLifecycle(lifecycle)
        super.onDestroy()
    }
}