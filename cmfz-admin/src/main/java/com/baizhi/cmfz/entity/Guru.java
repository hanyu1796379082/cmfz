package com.baizhi.cmfz.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

/*
*@Description 上师实体类
* @Author  韩雨
* @Time 2018-7-4  15:27
* */
public class Guru implements Serializable{

    @Excel(name="编号")
    private Integer id;
    @Excel(name="法名")
    private String name;
    @Excel(name="图片")
    private String photo;
    @Excel(name="描述信息")
    private String summary;

    public Guru(Integer id, String name, String photo, String summary) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.summary = summary;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Guru{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }

    public Guru() {
        super();
    }
}
