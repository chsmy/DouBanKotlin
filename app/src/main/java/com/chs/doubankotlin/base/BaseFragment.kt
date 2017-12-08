package com.chs.doubankotlin.base

import com.chs.doubankotlin.mvp.MvpFragment
import com.chs.doubankotlin.mvp.MvpPresenter
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-11-27 17:41
 * 邮箱：657083984@qq.com
 */
abstract class BaseFragment<V: MvpView,P: MvpPresenter<V>> : MvpFragment<V, P>() {

//    var rootView : View? = null
//
//    abstract fun getLayoutResources() : Int
//
//    abstract fun init()
//
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        mPresenter.attachLifecycle(lifecycle)
////    }
//
//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        if(rootView == null){
//            rootView = inflater?.inflate(getLayoutResources(),container,false)
//        }
//        return rootView
//    }
//
////    override fun onDestroy() {
////        mPresenter.detachLifecycle(lifecycle)
////        super.onDestroy()
////    }
//
//    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        init()
//    }
}