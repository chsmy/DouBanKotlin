package com.chs.doubankotlin.ui.home

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import com.chs.doubankotlin.R
import com.chs.doubankotlin.adapter.HomeAdapter
import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.mvp.MvpActivity
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.search_bar_edit.*

/**
 *  作者：chs on 2017-12-06 14:32
 * 邮箱：657083984@qq.com
 */
class SearchActivity : MvpActivity<IHomeView,HomePresenter<IHomeView>>() ,IHomeView{
    override fun createPresenter(): HomePresenter<IHomeView> {
        return HomePresenter(this)
    }

    var mList = mutableListOf<Home.SubjectsEntity>()
    var mAdapter : HomeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        search_toolbar.navigationIcon = ContextCompat.getDrawable(this,R.drawable.ic_back)
        search_toolbar.setNavigationOnClickListener {
                        finish()
        }
        search_view.onActionViewExpanded()
        search_view.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                (mPresenter as HomePresenter).search(query!!)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                (mPresenter as HomePresenter).search(newText!!)
                return true
            }

        })
        rl_search_list.layoutManager = LinearLayoutManager(this)
        mAdapter = HomeAdapter(R.layout.item_home_adapter,mList)
        rl_search_list.adapter = mAdapter
    }

    override fun setData(bean: Home) {
        status_view.showContent()
        bean.getSubjects()?.let { mList.addAll(it) }
        mAdapter?.notifyDataSetChanged()
    }

    override fun showLoading() {
        status_view.showLoading()
    }
}