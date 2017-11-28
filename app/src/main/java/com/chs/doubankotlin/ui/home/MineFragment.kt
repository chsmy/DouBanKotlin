package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment

/**
 *  作者：chs on 2017-11-28 14:52
 * 邮箱：657083984@qq.com
 */
class MineFragment : BaseFragment(){

    override fun init() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutResources(): Int {
        return R.layout.mine_fragment
    }

    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter()
    }

}