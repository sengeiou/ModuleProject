package com.feisukj.base.bean.ad


/**
 * Created by ATian on 2018/4/3.
 */

class AdPage {
    var start_page: TypeBean? = null//闪屏页面
    var category_page: TypeBean? = null//分类页面
    var detail_page: TypeBean? = null//详情页面
    var listening_page: TypeBean? = null//播放页面
    var home_page: TypeBean? = null//主页面
    var home_page_new:TypeBean?=null//主页面插屏
    override fun toString(): String {
        return "AdPage(detail_page=$detail_page, listening_page=$listening_page, category_page=$category_page, home_page=$home_page, home_page_new=$home_page_new, start_page=$start_page)"
    }

}
