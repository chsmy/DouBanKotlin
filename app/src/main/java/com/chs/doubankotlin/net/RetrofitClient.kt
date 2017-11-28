package com.chs.doubankotlin.net

import com.chs.doubankotlin.AppConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *  作者：chs on 2017-11-28 17:08
 * 邮箱：657083984@qq.com
 */
class RetrofitClient private constructor(){

    val baseUrl = "https://api.douban.com/v2/movie/"
    var mRetrofit : Retrofit? = null
    init {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(110, TimeUnit.SECONDS)
        builder.readTimeout(20, TimeUnit.SECONDS)
        builder.writeTimeout(20, TimeUnit.SECONDS)
        builder.retryOnConnectionFailure(true)

        if (AppConfig.DEBUG) {
            // Log信息拦截器
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            //设置 Debug Log 模式
            builder.addInterceptor(loggingInterceptor)
        }
        val okHttpClient = builder.build()
        mRetrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
    }

    companion object {
        fun getInstance() = Holder.instance
    }
    private object Holder{
        var instance = RetrofitClient()
    }

    fun <T> createReq(service: Class<T>): T? {
        return mRetrofit?.create(service)
    }
}