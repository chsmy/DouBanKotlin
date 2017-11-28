package com.chs.doubankotlin.net

import com.chs.doubankotlin.module.bean.Home
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  作者：chs on 2017-11-28 16:57
 * 邮箱：657083984@qq.com
 */
interface DataService{

    //https://api.douban.com/v2/movie/in_theaters?apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC&start=0&count=100&client=&udid=
    @GET("in_theaters?")
    fun getHomeData(@Query("apikey") apikey :String, @Query("city") city :String,@Query("start") start: Int ,@Query("count") count: Int
    ,@Query("client") client :String, @Query("udid") udid :String) : Observable<Home>

}