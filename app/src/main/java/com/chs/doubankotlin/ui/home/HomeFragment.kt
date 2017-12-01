package com.chs.doubankotlin.ui.home

import android.support.v7.widget.LinearLayoutManager
import com.chs.doubankotlin.R
import com.chs.doubankotlin.adapter.HomeAdapter
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment
import com.chs.doubankotlin.module.bean.Home
import kotlinx.android.synthetic.main.home_fragment.*

/**
 *  作者：chs on 2017-11-27 17:41
 * 邮箱：657083984@qq.com
 */
class HomeFragment : BaseFragment(),HomeContract.View {

    override fun showLoading() {
        status_view.showLoading()
    }

    override fun setData(bean: Home) {
        status_view.showContent()
        bean.getSubjects()?.let { mList.addAll(it) }
        mAdapter?.notifyDataSetChanged()
    }

    var mList = mutableListOf<Home.SubjectsEntity>()
    var mAdapter : HomeAdapter? = null

    override fun initPresenter(): BaseContract.Presenter {
        return HomePresenter(this)
    }

    override fun getLayoutResources(): Int {
        return R.layout.home_fragment
    }

    override fun init() {
        mPresenter.start()
        rl_home_list.layoutManager = LinearLayoutManager(context)
        mAdapter = HomeAdapter(R.layout.item_home_adapter,mList)
        rl_home_list.adapter = mAdapter
    }

}