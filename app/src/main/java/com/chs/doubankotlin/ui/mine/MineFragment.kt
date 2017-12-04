package com.chs.doubankotlin.ui.mine

import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.ui.home.HomeContract
import com.chs.doubankotlin.ui.home.HomePresenter

/**
 *  作者：chs on 2017-11-28 14:52
 * 邮箱：657083984@qq.com
 */
class MineFragment : BaseFragment(), HomeContract.View {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setData(bean: Home) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun init() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutResources(): Int {
        return R.layout.mine_fragment
    }

    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter(this)
    }

}