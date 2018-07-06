package com.baizhi.cmfz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 韩雨
 * @Time in 8:26 2018/7/6
 * @Despriction
 */
@Component
public class Picture implements Serializable{

    private Integer id;
    private String path;
    @JSONField(format="yyyy-MM-dd")
    private Date date;
    private String descrip;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", date=" + date +
                ", descrip='" + descrip + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Picture() {
        super();
    }
}
