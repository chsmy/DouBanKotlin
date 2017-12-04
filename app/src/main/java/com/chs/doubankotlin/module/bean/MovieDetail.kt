package com.chs.doubankotlin.module.bean

/**
 *  作者：chs on 2017-12-04 15:30
 * 邮箱：657083984@qq.com
 */
class MovieDetail{

    private var rating: RatingEntity? = null
    private var reviews_count: Int = 0
    private var wish_count: Int = 0
    private var douban_site: String? = null
    private var year: String? = null
    private var images: ImagesEntity? = null
    private var alt: String? = null
    private var id: String? = null
    private var mobile_url: String? = null
    private var title: String? = null
    private var do_count: Any? = null
    private var share_url: String? = null
    private var seasons_count: Any? = null
    private var schedule_url: String? = null
    private var episodes_count: Any? = null
    private var collect_count: Int = 0
    private var current_season: Any? = null
    private var original_title: String? = null
    private var summary: String? = null
    private var subtype: String? = null
    private var comments_count: Int = 0
    private var ratings_count: Int = 0
    private var countries: List<String>? = null
    private var genres: List<String>? = null
    private var casts: List<CastsEntity>? = null
    private var directors: List<DirectorsEntity>? = null
    private var aka: List<String>? = null

    fun getRating(): RatingEntity? {
        return rating
    }

    fun setRating(rating: RatingEntity) {
        this.rating = rating
    }

    fun getReviews_count(): Int {
        return reviews_count
    }

    fun setReviews_count(reviews_count: Int) {
        this.reviews_count = reviews_count
    }

    fun getWish_count(): Int {
        return wish_count
    }

    fun setWish_count(wish_count: Int) {
        this.wish_count = wish_count
    }

    fun getDouban_site(): String? {
        return douban_site
    }

    fun setDouban_site(douban_site: String) {
        this.douban_site = douban_site
    }

    fun getYear(): String? {
        return year
    }

    fun setYear(year: String) {
        this.year = year
    }

    fun getImages(): ImagesEntity? {
        return images
    }

    fun setImages(images: ImagesEntity) {
        this.images = images
    }

    fun getAlt(): String? {
        return alt
    }

    fun setAlt(alt: String) {
        this.alt = alt
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getMobile_url(): String? {
        return mobile_url
    }

    fun setMobile_url(mobile_url: String) {
        this.mobile_url = mobile_url
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getDo_count(): Any? {
        return do_count
    }

    fun setDo_count(do_count: Any) {
        this.do_count = do_count
    }

    fun getShare_url(): String? {
        return share_url
    }

    fun setShare_url(share_url: String) {
        this.share_url = share_url
    }

    fun getSeasons_count(): Any? {
        return seasons_count
    }

    fun setSeasons_count(seasons_count: Any) {
        this.seasons_count = seasons_count
    }

    fun getSchedule_url(): String? {
        return schedule_url
    }

    fun setSchedule_url(schedule_url: String) {
        this.schedule_url = schedule_url
    }

    fun getEpisodes_count(): Any? {
        return episodes_count
    }

    fun setEpisodes_count(episodes_count: Any) {
        this.episodes_count = episodes_count
    }

    fun getCollect_count(): Int {
        return collect_count
    }

    fun setCollect_count(collect_count: Int) {
        this.collect_count = collect_count
    }

    fun getCurrent_season(): Any? {
        return current_season
    }

    fun setCurrent_season(current_season: Any) {
        this.current_season = current_season
    }

    fun getOriginal_title(): String? {
        return original_title
    }

    fun setOriginal_title(original_title: String) {
        this.original_title = original_title
    }

    fun getSummary(): String? {
        return summary
    }

    fun setSummary(summary: String) {
        this.summary = summary
    }

    fun getSubtype(): String? {
        return subtype
    }

    fun setSubtype(subtype: String) {
        this.subtype = subtype
    }

    fun getComments_count(): Int {
        return comments_count
    }

    fun setComments_count(comments_count: Int) {
        this.comments_count = comments_count
    }

    fun getRatings_count(): Int {
        return ratings_count
    }

    fun setRatings_count(ratings_count: Int) {
        this.ratings_count = ratings_count
    }

    fun getCountries(): List<String>? {
        return countries
    }

    fun setCountries(countries: List<String>) {
        this.countries = countries
    }

    fun getGenres(): List<String>? {
        return genres
    }

    fun setGenres(genres: List<String>) {
        this.genres = genres
    }

    fun getCasts(): List<CastsEntity>? {
        return casts
    }

    fun setCasts(casts: List<CastsEntity>) {
        this.casts = casts
    }

    fun getDirectors(): List<DirectorsEntity>? {
        return directors
    }

    fun setDirectors(directors: List<DirectorsEntity>) {
        this.directors = directors
    }

    fun getAka(): List<String>? {
        return aka
    }

    fun setAka(aka: List<String>) {
        this.aka = aka
    }

    class RatingEntity {
        /**
         * max : 10
         * average : 7.1
         * stars : 35
         * min : 0
         */

        var max: Int = 0
        var average: Double = 0.toDouble()
        var stars: String? = null
        var min: Int = 0
    }

    class ImagesEntity {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         */

        var small: String? = null
        var large: String? = null
        var medium: String? = null
    }

    class CastsEntity {
        /**
         * alt : https://movie.douban.com/celebrity/1340497/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp"}
         * name : 塔伦·埃格顿
         * id : 1340497
         */

        var alt: String? = null
        var avatars: AvatarsEntity? = null
        var name: String? = null
        var id: String? = null

        class AvatarsEntity {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             */

            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }
    }

    class DirectorsEntity {
        /**
         * alt : https://movie.douban.com/celebrity/1031852/
         * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp"}
         * name : 马修·沃恩
         * id : 1031852
         */

        var alt: String? = null
        var avatars: AvatarsEntityX? = null
        var name: String? = null
        var id: String? = null

        class AvatarsEntityX {
            /**
             * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             */

            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }
    }
}