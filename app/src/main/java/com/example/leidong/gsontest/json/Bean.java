package com.example.leidong.gsontest.json;

import java.util.List;

/**
 * Created by leidong on 2017/3/14.
 */

public class Bean {

    /**
     * banner3 : {"title":"banner3","image":"http://img.zcool.cn/community/01d1f258c2722ea801219c77a28ffc.jpg@900w_1l_2o_100sh.jpg","url":"http://www.baidu.com","des":"banner3 des"}
     * banner1 : {"title":"banner1","image":"http://img.zcool.cn/community/01523158c27424a801219c77710ac4.jpg@900w_1l_2o_100sh.jpg","url":"http://www.baidu.com","des":"banner1 des"}
     * fungame : [{"title":"app1","image":"http://img.zcool.cn/community/019c28554b6159000001bf729078c0.jpg","url":"http://www.baidu.com","des":"app1 des"},{"title":"app2","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app2 des"},{"title":"app3","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app3 des"},{"title":"app4","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app4 des"}]
     * recommend : [{"title":"app1","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app1 des"},{"title":"app2","image":"http://img.zcool.cn/community/010e62554b615a000001bf72f2c362.jpg","url":"http://www.baidu.com","des":"app2 des"},{"title":"app3","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app3 des"},{"title":"app4","image":"http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg","url":"http://www.baidu.com","des":"app4 des"}]
     * banner2 : {"title":"banner2","image":"http://img.zcool.cn/community/0173ff58c2722ea801219c7745443e.jpg@900w_1l_2o_100sh.jpg","url":"http://www.baidu.com","des":"banner2 des"}
     */

    private Banner3Bean banner3;
    private Banner1Bean banner1;
    private Banner2Bean banner2;
    private List<FungameBean> fungame;
    private List<RecommendBean> recommend;

    public Banner3Bean getBanner3() {
        return banner3;
    }

    public void setBanner3(Banner3Bean banner3) {
        this.banner3 = banner3;
    }

    public Banner1Bean getBanner1() {
        return banner1;
    }

    public void setBanner1(Banner1Bean banner1) {
        this.banner1 = banner1;
    }

    public Banner2Bean getBanner2() {
        return banner2;
    }

    public void setBanner2(Banner2Bean banner2) {
        this.banner2 = banner2;
    }

    public List<FungameBean> getFungame() {
        return fungame;
    }

    public void setFungame(List<FungameBean> fungame) {
        this.fungame = fungame;
    }

    public List<RecommendBean> getRecommend() {
        return recommend;
    }

    public void setRecommend(List<RecommendBean> recommend) {
        this.recommend = recommend;
    }

    public static class Banner3Bean {
        /**
         * title : banner3
         * image : http://img.zcool.cn/community/01d1f258c2722ea801219c77a28ffc.jpg@900w_1l_2o_100sh.jpg
         * url : http://www.baidu.com
         * des : banner3 des
         */

        private String title;
        private String image;
        private String url;
        private String des;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }

    public static class Banner1Bean {
        /**
         * title : banner1
         * image : http://img.zcool.cn/community/01523158c27424a801219c77710ac4.jpg@900w_1l_2o_100sh.jpg
         * url : http://www.baidu.com
         * des : banner1 des
         */

        private String title;
        private String image;
        private String url;
        private String des;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }

    public static class Banner2Bean {
        /**
         * title : banner2
         * image : http://img.zcool.cn/community/0173ff58c2722ea801219c7745443e.jpg@900w_1l_2o_100sh.jpg
         * url : http://www.baidu.com
         * des : banner2 des
         */

        private String title;
        private String image;
        private String url;
        private String des;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }

    public static class FungameBean {
        /**
         * title : app1
         * image : http://img.zcool.cn/community/019c28554b6159000001bf729078c0.jpg
         * url : http://www.baidu.com
         * des : app1 des
         */

        private String title;
        private String image;
        private String url;
        private String des;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }

    public static class RecommendBean {
        /**
         * title : app1
         * image : http://img.zcool.cn/community/0136c0554b6159000001bf7215a00d.jpg
         * url : http://www.baidu.com
         * des : app1 des
         */

        private String title;
        private String image;
        private String url;
        private String des;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }
    }
}
