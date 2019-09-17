package com.nwpu.sign_up_system.service_impl;

import com.nwpu.sign_up_system.mapper.NewsMapper;
import com.nwpu.sign_up_system.model.News;
import com.nwpu.sign_up_system.service.NewsService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {


    @Autowired
    NewsMapper newsMapper;


    @Override
    public String publishNews(String title, String date, String content, String sender, String tag) {

        News news = new News(title,  date,  content,  sender,  tag);
        try {
            newsMapper.pulishNews(news);

        }catch (Exception e){

            return "publish failed!";
        }

        return "publish successfully!";

    };


    @Override
    public String deleteNews(int id) {


        try {
            newsMapper.deleteOneNews(id);
        }catch (Exception e){

            return "delete failed!";

        }

        return "delete successfully!";

    }

    @Override
    public JSONObject findAllTagNews(String tag) {
        return null;
    }



    @Override
    public JSONObject findAllNews() {


        List<News>  allNews = newsMapper.findAllNews();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject;

        for (News news: allNews){

        jsonObject = new JSONObject();

        jsonObject.put("title", news.getTitle());
        jsonObject.put("id", news.getId());
        jsonObject.put("date", news.getDate());
        jsonObject.put("content", news.getContent());
        jsonObject.put("sender", news.getSender());
        jsonObject.put("tag", news.getTag());

        jsonArray.add(jsonObject);

        }

        jsonObject = new JSONObject();

        jsonObject.put("result", jsonArray);
        return jsonObject;
}



    @Override
    public String findTitleById( int id) {

        return newsMapper.findTitleById(id);

    }
}

























