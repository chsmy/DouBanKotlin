package com.chs.doubankotlin.module.bean

import com.chad.library.adapter.base.entity.SectionEntity

/**
 *  作者：chs on 2017-11-30 16:14
 * 邮箱：657083984@qq.com
 */
class FindSection : SectionEntity<Home.SubjectsEntity> {

    constructor(entity: Home.SubjectsEntity) : super(entity) {

    }

    constructor(isHeader:Boolean,header:String) : super(isHeader,header) {

    }
}