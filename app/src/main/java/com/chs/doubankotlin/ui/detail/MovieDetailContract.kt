package com.chs.doubankotlin.ui.detail

import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.module.bean.MovieDetail

/**
 *  作者：chs on 2017-12-04 15:46
 * 邮箱：657083984@qq.com
 */
interface MovieDetailContract{
    interface View : BaseContract.View{
        fun setData(bean : MovieDetail)
        fun showLoading()
    }

    interface Presenter : BaseContract.Presenter{

    }
}