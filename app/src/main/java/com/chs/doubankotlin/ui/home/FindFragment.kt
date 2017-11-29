package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment
import com.chs.doubankotlin.module.bean.Home

/**
 *  作者：chs on 2017-11-28 14:51
 * 邮箱：657083984@qq.com
 */
class FindFragment : BaseFragment(),HomeContract.View{
    override fun setData(bean: Home) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun init() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutResources(): Int {
        return R.layout.find_fragment
    }

    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter(this)
    }

}