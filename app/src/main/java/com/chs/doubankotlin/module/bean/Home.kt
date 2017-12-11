package com.chs.doubankotlin.module.bean
import com.google.gson.annotations.SerializedName


/**
 *  作者：chs on 2017-11-28 16:30
 * 邮箱：657083984@qq.com
 */

data class Home(
		@SerializedName("count") val count: Int = 0,
		@SerializedName("start") val start: Int = 0,
		@SerializedName("total") val total: Int = 0,
		@SerializedName("subjects") val subjects: List<Subject> = listOf(),
		@SerializedName("title") val title: String = ""
)

data class Subject(
		@SerializedName("rating") val rating: Rating = Rating(),
		@SerializedName("genres") val genres: List<String> = listOf(),
		@SerializedName("title") val title: String = "",
		@SerializedName("casts") val casts: List<Cast> = listOf(),
		@SerializedName("collect_count") val collectCount: Int = 0,
		@SerializedName("original_title") val originalTitle: String = "",
		@SerializedName("subtype") val subtype: String = "",
		@SerializedName("directors") val directors: List<Director> = listOf(),
		@SerializedName("year") val year: String = "",
		@SerializedName("images") val images: Images = Images(),
		@SerializedName("alt") val alt: String = "",
		@SerializedName("id") val id: String = ""
)

data class Director(
		@SerializedName("alt") val alt: String = "",
		@SerializedName("avatars") val avatars: Avatars = Avatars(),
		@SerializedName("name") val name: String = "",
		@SerializedName("id") val id: String = ""
)

data class Avatars(
		@SerializedName("small") val small: String = "",
		@SerializedName("large") val large: String = "",
		@SerializedName("medium") val medium: String = ""
)

data class Images(
		@SerializedName("small") val small: String = "",
		@SerializedName("large") val large: String = "",
		@SerializedName("medium") val medium: String = ""
)

data class Rating(
		@SerializedName("max") val max: Int = 0,
		@SerializedName("average") val average: Float = 0.0F,
		@SerializedName("stars") val stars: String = "",
		@SerializedName("min") val min: Int = 0
)

data class Cast(
		@SerializedName("alt") val alt: String = "",
		@SerializedName("avatars") val avatars: Avatars = Avatars(),
		@SerializedName("name") val name: String = "",
		@SerializedName("id") val id: String = ""
)