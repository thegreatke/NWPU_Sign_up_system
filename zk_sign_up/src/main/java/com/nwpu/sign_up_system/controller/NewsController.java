package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.service.NewsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class NewsController {


    @Autowired
    NewsService newsService;

    @RequestMapping("/publishNews")
    public String publishNews(@RequestParam("title") String title,
//                            @RequestParam("id") int id,
                            @RequestParam("date") String date,
                            @RequestParam("content") String content,
                            @RequestParam("sender") String sender,
                            @RequestParam("tag") String tag
                            ){

    return  newsService.publishNews(title, date, content, sender, tag);

    }




    @RequestMapping("/findAllNews")
    public JSONObject findAllNews(){

        return  newsService.findAllNews();
    }

    @RequestMapping("/deleteOneNew")
    public String  findAllNews(@RequestParam("id") int id){
        String title = newsService.findTitleById(id);
        if (title == null) return "id is not exist, failed!";

        else return  newsService.deleteNews(id);
    }



}
