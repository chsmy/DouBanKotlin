package com.chs.doubankotlin.mvp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chs.doubankotlin.mvp.delegate.FragmentMvpDelegate
import com.chs.doubankotlin.mvp.delegate.FragmentMvpDelegateImpl
import com.chs.doubankotlin.mvp.delegate.MvpDelegateCallBack


/**
 *  作者：chs on 2017-12-08 15:36
 * 邮箱：657083984@qq.com
 */
abstract class MvpFragment<V:MvpView,P:MvpPresenter<V>> : Fragment() , MvpDelegateCallBack<V, P>, MvpView{

    private var mvpDelegate: FragmentMvpDelegate<V, P>? = null
    protected var mPresenter: P? = null
    var rootView : View? = null
    abstract fun getLayoutResources() : Int

    abstract fun init()

    protected fun getMvpDelegate(): FragmentMvpDelegate<V, P> {
        if (mvpDelegate == null) {
            mvpDelegate = FragmentMvpDelegateImpl(this, this)
        }

        return mvpDelegate as FragmentMvpDelegate<V, P>
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


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(rootView == null){
            rootView = inflater?.inflate(getLayoutResources(),container,false)
        }
        return rootView
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        if(savedInstanceState!=null)
        getMvpDelegate().onViewCreated(view!!, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        getMvpDelegate().onDestroyView()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter()
        if(savedInstanceState!=null)
        getMvpDelegate().onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        getMvpDelegate().onDestroy()
    }

    override fun onPause() {
        super.onPause()
        getMvpDelegate().onPause()
    }

    override fun onResume() {
        super.onResume()
        getMvpDelegate().onResume()
    }

    override fun onStart() {
        super.onStart()
        getMvpDelegate().onStart()
    }

    override fun onStop() {
        super.onStop()
        getMvpDelegate().onStop()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        getMvpDelegate().onActivityCreated(savedInstanceState!!)
    }

    override fun onDetach() {
        super.onDetach()
        getMvpDelegate().onDetach()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
//        getMvpDelegate().onSaveInstanceState(outState!!)
    }
}