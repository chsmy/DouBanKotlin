package com.chs.doubankotlin.mvp

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.chs.doubankotlin.R
import com.chs.doubankotlin.mvp.delegate.ActivityMvpDelegate
import com.chs.doubankotlin.mvp.delegate.ActivityMvpDelegateImpl
import com.chs.doubankotlin.mvp.delegate.MvpDelegateCallBack
import com.chs.doubankotlin.util.StatusBarUtil


/**
 *  作者：chs on 2017-12-08 09:40
 * 邮箱：657083984@qq.com
 */
abstract class MvpActivity<V : MvpView ,P: MvpPresenter<V>> : AppCompatActivity() ,MvpView,MvpDelegateCallBack<V,P>{

    private var mvpDelegate: ActivityMvpDelegate<V,P>? = null
    var mPresenter: P? = null
    protected var retainInstance: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setColor(this, ContextCompat.getColor(this, R.color.colorPrimary),0);
        mPresenter = createPresenter()
        if(savedInstanceState!=null)
        getMvpDelegate().onCreate(savedInstanceState);
    }

    override fun onResume() {
        super.onResume()
        getMvpDelegate().onResume()
    }

    override fun onStart() {
        super.onStart()
        getMvpDelegate().onStart()
    }

    override fun onPause() {
        super.onPause()
        getMvpDelegate().onPause()
    }

    override fun onStop() {
        super.onStop()
        getMvpDelegate().onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        getMvpDelegate().onDestroy()
    }



   private fun getMvpDelegate(): ActivityMvpDelegate<V,P> {
        if (mvpDelegate == null) {
            mvpDelegate = ActivityMvpDelegateImpl(this, this, true)
        }
        return mvpDelegate as ActivityMvpDelegate<V, P>
    }

    override fun getPresenter(): P {
        return mPresenter!!
    }

    override fun setPresenter(presenter: P) {
        this.mPresenter = presenter
    }

    override fun getMvpView(): V {
        return this as V
    }
}