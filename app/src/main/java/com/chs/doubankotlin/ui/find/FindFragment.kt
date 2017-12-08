package com.chs.doubankotlin.ui.find

import android.content.Intent
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.chs.doubankotlin.R
import com.chs.doubankotlin.R.id.*
import com.chs.doubankotlin.adapter.FindAdapter
import com.chs.doubankotlin.module.bean.Find
import com.chs.doubankotlin.module.bean.FindSection
import com.chs.doubankotlin.mvp.MvpFragment
import com.chs.doubankotlin.ui.detail.MovieDetailActivity
import com.chs.doubankotlin.ui.home.SearchActivity
import kotlinx.android.synthetic.main.find_fragment.*
import kotlinx.android.synthetic.main.search_bar_text.*

/**
 *  作者：chs on 2017-11-28 14:51
 * 邮箱：657083984@qq.com
 */
class FindFragment : MvpFragment<FindContract.View,FindPresenter<FindContract.View>>(), FindContract.View {
    override fun createPresenter(): FindPresenter<FindContract.View> {
        return FindPresenter(this)
    }


    var mList = mutableListOf<FindSection>()
    var mAdapter : FindAdapter? = null

    override fun showLoading() {
        find_status_view.showLoading()
    }

    override fun setData(bean: Find) {
        find_status_view.showContent()
        bean.mSection.let { mList.addAll(it) }
        mAdapter = FindAdapter(R.layout.item_find_adapter,R.layout.item_find_header,mList)
        mAdapter!!.setOnItemClickListener { adapter, view, position ->
            val entity = bean.mSection.get(position)
            if (entity.isHeader){
                Toast.makeText(context, entity.header, Toast.LENGTH_LONG).show()
            } else{
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra("movieId",entity.t.id)
            startActivity(intent)
            }
        }
        mAdapter!!.setOnItemChildClickListener { adapter, view, position ->
            Toast.makeText(context, "onItemChildClick" + position, Toast.LENGTH_LONG).show() }
        rl_find_list.adapter = mAdapter
    }

    override fun init() {
        mPresenter!!.start()
        rl_find_list.layoutManager = GridLayoutManager(context,3,GridLayoutManager.VERTICAL,false)

        relative_search.setOnClickListener{
            val intent = Intent(context, SearchActivity::class.java)
            context.startActivity(intent)
        }

    }

    override fun getLayoutResources(): Int {
        return R.layout.find_fragment
    }

}