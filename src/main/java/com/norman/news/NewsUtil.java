package com.norman.news;

import java.util.ArrayList;
import java.util.List;

public class NewsUtil {
    /** 获取频道名称 */
    List<String> getChannel() {
        ArrayList<String> list = new ArrayList<>();
        list.add("推荐");
        list.add("热点");
        list.add("社会");
        list.add("娱乐");
        list.add("科技");
        list.add("汽车");
        list.add("体育");
        list.add("财经");
        list.add("军事");
        list.add("国际");
        list.add("时尚");
        list.add("游戏");
        list.add("旅游");
        list.add("历史");
        list.add("探索");
        list.add("美食");
        list.add("育儿");
        list.add("养生");
        list.add("故事");
        list.add("美文");
        return list;
    }

    /** 获取频道编码 */
  public   List<String> getChannelCode() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("news_hot");
        list.add("news_society");
        list.add("news_entertainment");
        list.add("news_tech");
        list.add("news_car");
        list.add("news_sports");
        list.add("news_finance");
        list.add("news_military");
        list.add("news_world");
        list.add("news_fashion");
        list.add("news_game");
        list.add("news_travel");
        list.add("news_history");
        list.add("news_discovery");
        list.add("news_food");
        list.add("news_baby");
        list.add("news_regimen");
        list.add("news_story");
        list.add("news_essay");
        return list;
    }



}
