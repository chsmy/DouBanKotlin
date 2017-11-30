package com.chs.doubankotlin.ui.find

import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.module.bean.Find

/**
 *  作者：chs on 2017-11-30 14:12
 * 邮箱：657083984@qq.com
 */
class FindContract{
    interface View : BaseContract.View<Presenter>{
        fun setData(bean : Find)
    }
    interface Presenter : BaseContract.Presenter{

    }
}