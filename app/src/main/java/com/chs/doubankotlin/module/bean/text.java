package com.chs.doubankotlin.module.bean;

import java.util.List;

/**
 * 作者：chs on 2017-11-30 11:09
 * 邮箱：657083984@qq.com
 */

public class text {


    /**
     * rating : {"max":10,"average":7.1,"stars":"35","min":0}
     * reviews_count : 1025
     * wish_count : 38495
     * douban_site :
     * year : 2017
     * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp"}
     * alt : https://movie.douban.com/subject/26378579/
     * id : 26378579
     * mobile_url : https://movie.douban.com/subject/26378579/mobile
     * title : 王牌特工2：黄金圈
     * do_count : null
     * share_url : https://m.douban.com/movie/subject/26378579
     * seasons_count : null
     * schedule_url :
     * episodes_count : null
     * countries : ["英国","美国"]
     * genres : ["喜剧","动作","冒险"]
     * collect_count : 138109
     * casts : [{"alt":"https://movie.douban.com/celebrity/1340497/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp"},"name":"塔伦·埃格顿","id":"1340497"},{"alt":"https://movie.douban.com/celebrity/1031223/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497.webp"},"name":"科林·费尔斯","id":"1031223"},{"alt":"https://movie.douban.com/celebrity/1274374/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1457350889.15.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1457350889.15.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1457350889.15.webp"},"name":"马克·斯特朗","id":"1274374"},{"alt":"https://movie.douban.com/celebrity/1054519/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1364.webp"},"name":"朱丽安·摩尔","id":"1054519"}]
     * current_season : null
     * original_title : Kingsman: The Golden Circle
     * summary : 时光飞逝，一转眼，艾格西（塔伦·埃格顿 Taron Egerton 饰）已经成长为了一名出色而又可靠的特工，他和蒂尔德公主（汉娜·阿尔斯托姆 Hanna Alström 饰）之间的感情也愈演愈浓，两人眼看着就要携手步入婚姻的殿堂。就在这个节骨眼上，前特工查理（爱德华·霍尔克罗夫特 Edward Holcroft 饰）杀了回来，如今的他效力于一个名为“黄金圈”的贩毒组织，组织头目波比（朱丽安·摩尔 Julianne Moore 饰）是一个邪恶而又野心勃勃的女人。 查理查出了金士曼的所有据点，用导弹将它们全部摧毁。幸存的艾格西和梅林（马克·斯特朗 Mark Strong 饰）千里迢迢远赴美国，向潜伏在那里的联邦特工寻求帮助。波比种植了一种含有毒素的大麻，将它们输送往世界各地，当瘾君子们体内的毒素渐渐发作后，波比以此为筹码，正式向政府宣战。©豆瓣
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1031852/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp"},"name":"马修·沃恩","id":"1031852"}]
     * comments_count : 59316
     * ratings_count : 128813
     * aka : ["王牌特工2","皇家特工：金圈子(港)","金牌特务：机密对决(台)","王牌特工2：黄金圆环","王牌特工：黄金圈","Kingsman 2"]
     */

    private RatingEntity rating;
    private int reviews_count;
    private int wish_count;
    private String douban_site;
    private String year;
    private ImagesEntity images;
    private String alt;
    private String id;
    private String mobile_url;
    private String title;
    private Object do_count;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private Object episodes_count;
    private int collect_count;
    private Object current_season;
    private String original_title;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<String> countries;
    private List<String> genres;
    private List<CastsEntity> casts;
    private List<DirectorsEntity> directors;
    private List<String> aka;

    public RatingEntity getRating() {
        return rating;
    }

    public void setRating(RatingEntity rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesEntity getImages() {
        return images;
    }

    public void setImages(ImagesEntity images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsEntity> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsEntity> casts) {
        this.casts = casts;
    }

    public List<DirectorsEntity> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsEntity> directors) {
        this.directors = directors;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingEntity {
        /**
         * max : 10
         * average : 7.1
         * stars : 35
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesEntity {
        /**
         * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2499792043.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsEntity {
        /**
         * alt : https://movie.douban.com/celebrity/1340497/
         * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp"}
         * name : 塔伦·埃格顿
         * id : 1340497
         */

        private String alt;
        private AvatarsEntity avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsEntity getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsEntity avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsEntity {
            /**
             * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1427132812.83.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsEntity {
        /**
         * alt : https://movie.douban.com/celebrity/1031852/
         * avatars : {"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp"}
         * name : 马修·沃恩
         * id : 1031852
         */

        private String alt;
        private AvatarsEntityX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsEntityX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsEntityX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsEntityX {
            /**
             * small : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             * large : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             * medium : https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9038.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
