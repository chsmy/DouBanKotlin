package com.chs.doubankotlin.ui.mine

import com.chs.doubankotlin.R
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.mvp.MvpFragment
import com.chs.doubankotlin.ui.home.HomePresenter
import com.chs.doubankotlin.ui.home.IHomeView

/**
 *  作者：chs on 2017-11-28 14:52
 * 邮箱：657083984@qq.com
 */
class MineFragment :MvpFragment<IHomeView,HomePresenter<IHomeView>>() ,IHomeView{
    override fun createPresenter(): HomePresenter<IHomeView> {
        return HomePresenter(this)
    }

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


}