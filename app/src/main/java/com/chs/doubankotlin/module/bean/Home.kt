package com.chs.doubankotlin.module.bean

/**
 *  作者：chs on 2017-11-28 16:30
 * 邮箱：657083984@qq.com
 */
class Home{
    /**
     * count : 100
     * start : 0
     * total : 40
     * subjects : [{"rating":{"max":10,"average":9.3,"details":{"1":11,"2":51,"3":1036,"4":6366,"5":16036},"stars":"50","min":0},"genres":["喜剧","动画","冒险"],"title":"寻梦环游记","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp"},"name_en":"Anthony Gonzalez","name":"安东尼·冈萨雷斯","alt":"https://movie.douban.com/celebrity/1370411/","id":"1370411"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp"},"name_en":"Gael García Bernal","name":"盖尔·加西亚·贝纳尔","alt":"https://movie.douban.com/celebrity/1041009/","id":"1041009"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp"},"name_en":"Benjamin Bratt","name":"本杰明·布拉特","alt":"https://movie.douban.com/celebrity/1036383/","id":"1036383"}],"durations":["105分钟"],"collect_count":70344,"mainland_pubdate":"2017-11-24","has_video":false,"original_title":"Coco","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp"},"name_en":"Lee Unkrich","name":"李·昂克里奇","alt":"https://movie.douban.com/celebrity/1022678/","id":"1022678"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp"},"name_en":"Adrian Molina","name":"阿德里安·莫利纳","alt":"https://movie.douban.com/celebrity/1370425/","id":"1370425"}],"pubdates":["2017-10-20(莫雷利亚电影节)","2017-11-22(美国)","2017-11-24(中国大陆)"],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp"},"alt":"https://movie.douban.com/subject/20495023/","id":"20495023"},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}]
     * title : 正在上映的电影-北京
     */

    private var count: Int = 0
    private var start: Int = 0
    private var total: Int = 0
    private var title: String? = null
    private var subjects: List<SubjectsEntity>? = null

    fun getCount(): Int {
        return count
    }

    fun setCount(count: Int) {
        this.count = count
    }

    fun getStart(): Int {
        return start
    }

    fun setStart(start: Int) {
        this.start = start
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(total: Int) {
        this.total = total
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getSubjects(): List<SubjectsEntity>? {
        return subjects
    }

    fun setSubjects(subjects: List<SubjectsEntity>) {
        this.subjects = subjects
    }

    class SubjectsEntity {
        /**
         * rating : {"max":10,"average":9.3,"details":{"1":11,"2":51,"3":1036,"4":6366,"5":16036},"stars":"50","min":0}
         * genres : ["喜剧","动画","冒险"]
         * title : 寻梦环游记
         * casts : [{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp"},"name_en":"Anthony Gonzalez","name":"安东尼·冈萨雷斯","alt":"https://movie.douban.com/celebrity/1370411/","id":"1370411"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1510634028.69.webp"},"name_en":"Gael García Bernal","name":"盖尔·加西亚·贝纳尔","alt":"https://movie.douban.com/celebrity/1041009/","id":"1041009"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1416762292.89.webp"},"name_en":"Benjamin Bratt","name":"本杰明·布拉特","alt":"https://movie.douban.com/celebrity/1036383/","id":"1036383"}]
         * durations : ["105分钟"]
         * collect_count : 70344
         * mainland_pubdate : 2017-11-24
         * has_video : false
         * original_title : Coco
         * subtype : movie
         * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp"},"name_en":"Lee Unkrich","name":"李·昂克里奇","alt":"https://movie.douban.com/celebrity/1022678/","id":"1022678"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497195148.21.webp"},"name_en":"Adrian Molina","name":"阿德里安·莫利纳","alt":"https://movie.douban.com/celebrity/1370425/","id":"1370425"}]
         * pubdates : ["2017-10-20(莫雷利亚电影节)","2017-11-22(美国)","2017-11-24(中国大陆)"]
         * year : 2017
         * images : {"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp"}
         * alt : https://movie.douban.com/subject/20495023/
         * id : 20495023
         */

        var rating: RatingEntity? = null
        var title: String? = null
        var collect_count: Int = 0
        var mainland_pubdate: String? = null
        var isHas_video: Boolean = false
        var original_title: String? = null
        var subtype: String? = null
        var year: String? = null
        var images: ImagesEntity? = null
        var alt: String? = null
        var id: String? = null
        var genres: List<String>? = null
        var casts: List<CastsEntity>? = null
        var durations: List<String>? = null
        var directors: List<DirectorsEntity>? = null
        var pubdates: List<String>? = null

        class RatingEntity {
            /**
             * max : 10
             * average : 9.3
             * details : {"1":11,"2":51,"3":1036,"4":6366,"5":16036}
             * stars : 50
             * min : 0
             */

            var max: Int = 0
            var average: Float = 0.toFloat()
            var details: DetailsEntity? = null
            var stars: String? = null
            var min: Int = 0

            class DetailsEntity {
                /**
                 * 1 : 11
                 * 2 : 51
                 * 3 : 1036
                 * 4 : 6366
                 * 5 : 16036
                 */

                @com.google.gson.annotations.SerializedName("1")
                var `_$1`: Int = 0
                @com.google.gson.annotations.SerializedName("2")
                var `_$2`: Int = 0
                @com.google.gson.annotations.SerializedName("3")
                var `_$3`: Int = 0
                @com.google.gson.annotations.SerializedName("4")
                var `_$4`: Int = 0
                @com.google.gson.annotations.SerializedName("5")
                var `_$5`: Int = 0
            }
        }

        class ImagesEntity {
            /**
             * small : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             * large : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             * medium : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp
             */

            var small: String? = null
            var large: String? = null
            var medium: String? = null
        }

        class CastsEntity {
            /**
             * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp"}
             * name_en : Anthony Gonzalez
             * name : 安东尼·冈萨雷斯
             * alt : https://movie.douban.com/celebrity/1370411/
             * id : 1370411
             */

            var avatars: AvatarsEntity? = null
            var name_en: String? = null
            var name: String? = null
            var alt: String? = null
            var id: String? = null

            class AvatarsEntity {
                /**
                 * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp
                 * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp
                 * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1489594517.9.webp
                 */

                var small: String? = null
                var large: String? = null
                var medium: String? = null
            }
        }

        class DirectorsEntity {
            /**
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp"}
             * name_en : Lee Unkrich
             * name : 李·昂克里奇
             * alt : https://movie.douban.com/celebrity/1022678/
             * id : 1022678
             */

            var avatars: AvatarsEntityX? = null
            var name_en: String? = null
            var name: String? = null
            var alt: String? = null
            var id: String? = null

            class AvatarsEntityX {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13830.webp
                 */

                var small: String? = null
                var large: String? = null
                var medium: String? = null
            }
        }
    }
}