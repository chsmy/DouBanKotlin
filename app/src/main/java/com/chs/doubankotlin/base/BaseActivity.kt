package com.chs.doubankotlin.base

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.chs.doubankotlin.R
import com.chs.doubankotlin.util.StatusBarUtil

/**
 *  作者：chs on 2017-11-28 09:54
 * 邮箱：657083984@qq.com
 */
abstract class BaseActivity : AppCompatActivity(),BaseContract.View{

     lateinit var mPresenter : BaseContract.Presenter

     abstract fun initPresenter() : BaseContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setColor(this, ContextCompat.getColor(this,R.color.colorPrimary));
        mPresenter = initPresenter()
        mPresenter.attachLifecycle(lifecycle)
    }

    override fun onDestroy() {
        mPresenter.detachLifecycle(lifecycle)
        super.onDestroy()
    }
}