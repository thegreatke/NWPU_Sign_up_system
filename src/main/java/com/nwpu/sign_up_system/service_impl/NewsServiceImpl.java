package com.nwpu.sign_up_system.service_impl;


import com.nwpu.sign_up_system.mapper.NewsMapper;
import com.nwpu.sign_up_system.model.News;
import com.nwpu.sign_up_system.service.NewsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {


    @Autowired
    NewsMapper newsMapper;



    @Override
    public void publishNews(String title, String date, String content, String sender, String tag) {

        News news = new News(title,  date,  content,  sender,  tag);

        newsMapper.pulishNews(news);

    };


    @Override
    public int deleteNews(String id) {
        return 0;
    }

    @Override
    public JSONObject findAllTagNews(String tag) {
        return null;
    }

    @Override
    public JSONObject findAllNews() {
        return null;
    }
}
