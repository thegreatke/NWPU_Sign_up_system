package com.nwpu.sign_up_system.model;

import lombok.Data;

@Data
public class News {

    private String title; //标题
    private int id;   //主键
    private String date; //time
    private String content; //内容
    private String sender;  //发布单位
    private String tag;   //标签

    public News(String title,  String date, String content, String sender, String tag) {
        this.title = title;
        this.date = date;
        this.content = content;
        this.sender = sender;
        this.tag = tag;
    }

    public News(String title, int id, String date, String content, String sender, String tag) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.content = content;
        this.sender = sender;
        this.tag = tag;
    }
}
