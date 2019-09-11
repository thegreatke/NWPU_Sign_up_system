package com.nwpu.sign_up_system.service;


import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public interface NewsService {


    /**
     *  发布一条新闻
     * @param title
     * @param date
     * @param content
     * @param sender
     * @param tag
     */
    @Transactional
    String publishNews(String title, String date, String content, String sender, String tag);


    /**
     * 指定删除某一条新闻动态
     * @param id
     * @return
     */
    @Transactional
    String deleteNews(int id);


    /**
     *
     * 返回当前标签下的所有的新闻动态
     * @param tag
     * @return
     */
    JSONObject findAllTagNews(String tag);




    /**
     * 返回所有的新闻
     * @return
     */
    JSONObject findAllNews();


    /**
     *
     * @return title
     */
    String findTitleById(int id);



}
