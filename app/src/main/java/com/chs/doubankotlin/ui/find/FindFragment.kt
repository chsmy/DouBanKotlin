package com.chs.doubankotlin.ui.find

import android.support.v7.widget.GridLayoutManager
import com.chs.doubankotlin.R
import com.chs.doubankotlin.adapter.FindAdapter
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.base.BaseFragment
import com.chs.doubankotlin.module.bean.Find
import com.chs.doubankotlin.module.bean.FindSection
import kotlinx.android.synthetic.main.find_fragment.*

/**
 *  作者：chs on 2017-11-28 14:51
 * 邮箱：657083984@qq.com
 */
class FindFragment : BaseFragment(), FindContract.View {

    var mList = mutableListOf<FindSection>()
    var mAdapter : FindAdapter? = null

    override fun setData(bean: Find) {
        bean.mSection.let { mList.addAll(it) }
        mAdapter = FindAdapter(R.layout.item_find_adapter,R.layout.item_find_header,mList)
        rl_find_list.adapter = mAdapter
    }

    override fun init() {
        mPresenter.start()
        rl_find_list.layoutManager = GridLayoutManager(context,3,GridLayoutManager.VERTICAL,false)
    }

    override fun getLayoutResources(): Int {
        return R.layout.find_fragment
    }

    override fun initPresenter(): BaseContract.Presenter {
        return FindPresenter(this)
    }

}