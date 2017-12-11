package com.chs.doubankotlin.module.bean
import com.google.gson.annotations.SerializedName



/**
 *  作者：chs on 2017-12-04 15:30
 * 邮箱：657083984@qq.com
 */

data class MovieDetail(
		@SerializedName("rating") val rating: Rating = Rating(),
		@SerializedName("reviews_count") val reviewsCount: Int = 0,
		@SerializedName("wish_count") val wishCount: Int = 0,
		@SerializedName("douban_site") val doubanSite: String = "",
		@SerializedName("year") val year: String = "",
		@SerializedName("images") val images: Images = Images(),
		@SerializedName("alt") val alt: String = "",
		@SerializedName("id") val id: String = "",
		@SerializedName("mobile_url") val mobileUrl: String = "",
		@SerializedName("title") val title: String = "",
		@SerializedName("do_count") val doCount: Any = Any(),
		@SerializedName("share_url") val shareUrl: String = "",
		@SerializedName("seasons_count") val seasonsCount: Any = Any(),
		@SerializedName("schedule_url") val scheduleUrl: String = "",
		@SerializedName("episodes_count") val episodesCount: Any = Any(),
		@SerializedName("countries") val countries: List<String> = listOf(),
		@SerializedName("genres") val genres: List<String> = listOf(),
		@SerializedName("collect_count") val collectCount: Int = 0,
		@SerializedName("casts") val casts: List<Cast> = listOf(),
		@SerializedName("current_season") val currentSeason: Any = Any(),
		@SerializedName("original_title") val originalTitle: String = "",
		@SerializedName("summary") val summary: String = "",
		@SerializedName("subtype") val subtype: String = "",
		@SerializedName("directors") val directors: List<Director> = listOf(),
		@SerializedName("comments_count") val commentsCount: Int = 0,
		@SerializedName("ratings_count") val ratingsCount: Int = 0,
		@SerializedName("aka") val aka: List<String> = listOf()
)



