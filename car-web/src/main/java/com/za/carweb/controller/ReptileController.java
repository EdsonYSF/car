package com.za.carweb.controller;

import com.za.cartoolbox.RedisUtils;
import com.za.carweb.utils.HttpClientDownPage;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.*;


/**
 * 爬取热点
 */
@Component
public class ReptileController {


    @Value("${douban.url}")
    private String url;


    /**
     * 定时任务，每60秒添加一次首页地址
     */
    @Scheduled(cron = "0/60 * * * * MON-SAT")
    public void adUrl() {
        if (StringUtils.isNotBlank(url)) {
            //通过HttpClient请求页面，获取网页源码进行解析
            String content = HttpClientDownPage.sendGet(url);
            //通过Jsoup进行页面解析
            Document document = Jsoup.parse(content);
            paraseList(document);
        }

        System.out.println("-----结束----");
    }


    /**
     * 解析热点列表框
     *
     * @param document
     */
    private void paraseList(Document document) {
        //根据网页标签解析源码
        Elements elements = document.select("tbody").select("tr");
        elements.remove(0);
        LinkedList<Map> list = new LinkedList<>();
        for (Element element : elements) {
            String hotsearchName = element.select("a[class=list-title]").text();
            String clickRate = element.select("span[class=icon-rise]").text();
            System.out.println("热搜榜=========" + hotsearchName + "======" + clickRate);
            Map map = new HashMap();
            map.put("hotsearchName", hotsearchName);
            map.put("clickRate", clickRate);
            list.add(map);
        }
        RedisUtils.put("KEY", list);
    }


}
