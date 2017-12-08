package com.chs.doubankotlin.mvp.delegate

import android.app.Activity
import android.os.Bundle
import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView
import java.util.*


/**
 *  作者：chs on 2017-12-08 09:53
 * 邮箱：657083984@qq.com
 * 控制activity的生命周期接口实现类
 */
class ActivityMvpDelegateImpl<in V:MvpView , out P:MvpPresenter<V>>
/**
 *  keepPresenterInstance 是否保持presenter实例
 */(activity: Activity, delegateCallback: MvpDelegateCallBack<V, P>, private var keepPresenterInstance: Boolean) : ActivityMvpDelegate<V,P>{

    private var delegateCallback :MvpDelegateCallBack<V,P>? = delegateCallback
    private var currentId : String? = null
    protected val KEY_MOSBY_VIEW_ID = "com.hannesdorfmann.mosby3.activity.mvp.id"

    /**
     * 是否保持presenter实例 当屏幕旋转的时候
     */
    fun retainPresenterInstance(keepPresenterInstance:Boolean , activity: Activity) : Boolean{
        return keepPresenterInstance && (activity.isChangingConfigurations
                || !activity.isFinishing);
    }

    private fun createCurrentIdAndCreatePresenter() : P{
       val presenter = delegateCallback!!.createPresenter()
        if(keepPresenterInstance){
            currentId = UUID.randomUUID().toString()
//            PresenterManager.putPresenter(activity, currentId!!, presenter as MvpPresenter<MvpView> );
        }
        return  presenter
    }

    override fun onCreate(bundle: Bundle) {
        val presenter: P = createCurrentIdAndCreatePresenter()

        delegateCallback!!.setPresenter(presenter)
        getPresenter().attachView(getMvpView())

    }

    private fun getPresenter(): P {
        return delegateCallback!!.getPresenter()
    }

    private fun getMvpView(): V {
        return delegateCallback!!.getMvpView()
    }

    override fun onDestroy() {
        getPresenter().detachView();
    }

    override fun onPause() {
    }

    override fun onResume() {
    }

    override fun onStart() {
    }

    override fun onStop() {
    }

    override fun onRestart() {
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        if (keepPresenterInstance) {
            savedInstanceState.putString(KEY_MOSBY_VIEW_ID, currentId);
        }
    }

}