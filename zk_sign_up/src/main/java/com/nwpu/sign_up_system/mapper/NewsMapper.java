package com.nwpu.sign_up_system.mapper;


import com.nwpu.sign_up_system.model.News;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Mapper
@Repository
public interface NewsMapper {



    @Insert("insert into news(title, id, date, content, sender,tag) " +
            "values(#{title},#{id},#{date},#{content},#{sender},#{tag})")
    void pulishNews(News news)throws SQLException;


    @Select("select * from news order by id desc")
    List<News> findAllNews();


    @Delete("delete  from news where id = #{id}")
    void deleteOneNews(@Param("id") int id) throws SQLException;


    @Select("select title from news where id = #{id}")
    String findTitleById(@Param("id") int id);




}
