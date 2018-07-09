package com.baizhi.cmfz.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author 韩雨
 * @Time in 20:11 2018/7/9
 * @Despriction
 */
@Component
public class Area implements Serializable {

    public Integer id;
    public String name;
    public String value;
    public String sex;

    public Area(Integer id, String name, String value, String sex) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.sex = sex;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Area() {
        super();
    }
}