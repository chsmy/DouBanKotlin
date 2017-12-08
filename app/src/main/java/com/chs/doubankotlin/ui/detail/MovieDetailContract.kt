package com.chs.doubankotlin.ui.detail

import com.chs.doubankotlin.module.bean.MovieDetail
import com.chs.doubankotlin.mvp.MvpView

/**
 *  作者：chs on 2017-12-04 15:46
 * 邮箱：657083984@qq.com
 */
interface MovieDetailContract{
    interface View : MvpView{
        fun setData(bean : MovieDetail)
        fun showLoading()
    }

    interface Presenter {

    }
}