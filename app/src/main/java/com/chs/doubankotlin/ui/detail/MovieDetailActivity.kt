package com.chs.doubankotlin.ui.detail

import android.os.Bundle
import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseActivity
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.module.bean.Find

/**
 *  作者：chs on 2017-12-04 15:13
 * 邮箱：657083984@qq.com
 */
class MovieDetailActivity : BaseActivity() , MovieDetailContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        mPresenter.start()
    }

    override fun initPresenter(): BaseContract.Presenter {
        return MovieDetailPresenter(this)
    }

    override fun setData(bean: Find) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}