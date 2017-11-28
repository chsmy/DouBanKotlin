package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment

/**
 *  作者：chs on 2017-11-27 17:41
 * 邮箱：657083984@qq.com
 */
class HomeFragment : BaseFragment(){

    override fun init() {
        mPresenter.start()
    }


    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter()
    }

    override fun getLayoutResources(): Int {
        return R.layout.home_fragment
    }

}