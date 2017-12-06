package com.chs.doubankotlin.net

import com.chs.doubankotlin.module.bean.Home
import com.chs.doubankotlin.module.bean.MovieDetail
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 *  作者：chs on 2017-11-28 16:57
 * 邮箱：657083984@qq.com
 */
interface DataService{

    //获取热门电影
    @GET("in_theaters")
    fun getHeatMovie(@Query("start") start: Int, @Query("count") count: Int): Observable<Home>

    //获取即将上映的电影
    @GET("coming_soon")
     fun getComingMovie(@Query("start") start: Int, @Query("count") count: Int): Observable<Home>

    //排行前250
    @GET("top250")
    fun getTop250(@Query("start") start: Int,
                          @Query("count") count: Int): Observable<Home>
    //新片榜
    @GET("new_movies")
    fun getNewMovie(@Query("apikey") apikey: String,@Query("start") start: Int,
                          @Query("count") count: Int): Observable<Home>

    //电影详情 https://api.douban.com/v2/movie/subject/26378579
    @GET("subject/{id}")
    fun getMovieDetail(@Path("id") id : String) : Observable<MovieDetail>

    //搜索
    @GET("search")
    fun searchMovies(@Query("q") q: String) : Observable<Home>
}