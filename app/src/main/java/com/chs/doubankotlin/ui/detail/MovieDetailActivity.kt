package com.chs.doubankotlin.ui.detail

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.chs.doubankotlin.R
import com.chs.doubankotlin.adapter.MovieDetailPersonAdapter
import com.chs.doubankotlin.module.bean.Cast
import com.chs.doubankotlin.module.bean.MovieDetail
import com.chs.doubankotlin.mvp.MvpActivity
import com.chs.doubankotlin.util.ImageLoader
import kotlinx.android.synthetic.main.activity_movie_detail.*

/**
 *  作者：chs on 2017-12-04 15:13
 * 邮箱：657083984@qq.com
 */
class MovieDetailActivity : MvpActivity<IMovieView, MovieDetailPresenter<IMovieView>>(),IMovieView{

    override fun createPresenter(): MovieDetailPresenter<IMovieView> {
        val presenter = MovieDetailPresenter<IMovieView>(this)
        presenter.id = intent.getStringExtra("movieId")
        return presenter
    }

    var shareUrl : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        mPresenter?.start()
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rl_movie_detail_person.layoutManager = layoutManager
    }


    override fun setData(bean: MovieDetail) {
        movie_detail_status_view.showContent()
        shareUrl = bean.shareUrl
        setSupportActionBar(toolbar)
        toolbar.navigationIcon = ContextCompat.getDrawable(this,R.drawable.ic_back)
        toolbar.title = ""
        toolbar.setNavigationOnClickListener {
            finish()
        }
        ImageLoader.loadImageView(this,bean.images.large,movie_detail_img)
        tv_detail_title.text = bean.title
        tv_detail_desc.text = (bean.year+"/"+bean.genres.toString()+"\n"+"原名："+bean.originalTitle+"\n"
                +"上映时间："+bean.year+ "\n"+"片长："+"110分钟")
        movie_detail_tv_rating.text = bean.rating.average.toString()
        movie_detail_rating_bar.rating = bean.rating.average/2
        movie_detail_desc.text = bean.summary

        val adapter = MovieDetailPersonAdapter(R.layout.item_detail_person, bean.casts as MutableList<Cast>?)
        rl_movie_detail_person.adapter = adapter
    }

    override fun showLoading() {
        movie_detail_status_view.showLoading()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.movie_detail,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.menu_share -> startActivity(Intent.createChooser(Intent(Intent.ACTION_SEND)
                    .setType("text/*").putExtra(Intent.EXTRA_TEXT, shareUrl),
                    "分享到"))
        }
        return super.onOptionsItemSelected(item)
    }
}