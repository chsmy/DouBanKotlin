package com.chs.doubankotlin.ui.home

import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.module.bean.Home

/**
 *  作者：chs on 2017-11-27 17:22
 * 邮箱：657083984@qq.com
 */
interface HomeContract{
    interface View : BaseContract.View{
        fun setData(bean : Home)
        fun showLoading()
    }
    interface Presenter : BaseContract.Presenter{

    }
}