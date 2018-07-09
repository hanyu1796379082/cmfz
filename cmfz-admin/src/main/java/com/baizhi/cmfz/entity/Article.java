package com.baizhi.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 韩雨
 * @Time in 9:46 2018/7/9
 * @Despriction
 */
@Component
public class Article implements Serializable{

    public Integer id;
    public String name;
    public Integer guruid;
    public String introduction;
    public Date date;
    public String pic;

    public Article(Integer id, String name, Integer guruid, String introduction, Date date, String pic) {
        this.id = id;
        this.name = name;
        this.guruid = guruid;
        this.introduction = introduction;
        this.date = date;
        this.pic = pic;
    }

    public Article() {
        super();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guruid=" + guruid +
                ", introduction='" + introduction + '\'' +
                ", date=" + date +
                ", pic='" + pic + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGuruid() {
        return guruid;
    }

    public void setGuruid(Integer guruid) {
        this.guruid = guruid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
