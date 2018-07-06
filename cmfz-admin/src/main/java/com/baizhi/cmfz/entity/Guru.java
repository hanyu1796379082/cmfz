package com.baizhi.cmfz.entity;

/*
*@Description 上师实体类
* @Author  韩雨
* @Time 2018-7-4  15:27
* */
public class Guru {

    private Integer id;
    private String name;
    private String photo;
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
