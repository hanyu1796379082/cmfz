package com.baizhi.cmfz.entity;

/*
* @Description 管理员类
* @Author  韩雨
* @Time 2018-7-4  15:34
* */

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Manager implements Serializable{

    private Integer id;
    private String name;
    private String password;
    private String salt;
    private String status;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Manager() {
        super();
    }
}
