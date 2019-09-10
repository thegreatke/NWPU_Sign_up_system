package com.nwpu.sign_up_system.mapper;


import com.nwpu.sign_up_system.model.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NewsMapper {



    @Insert("insert into news(title, id, date, content, sender,tag) " +
            "values(#{title},#{id},#{date},#{content},#{sender},#{tag})")
    void pulishNews(News news);








}
