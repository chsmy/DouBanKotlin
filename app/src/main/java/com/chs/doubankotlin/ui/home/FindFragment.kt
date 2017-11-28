package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment

/**
 *  作者：chs on 2017-11-28 14:51
 * 邮箱：657083984@qq.com
 */
class FindFragment : BaseFragment(){
    override fun getLayoutResources(): Int {
        return R.layout.find_fragment
    }

    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter()
    }

}