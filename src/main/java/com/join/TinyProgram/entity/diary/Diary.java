package com.join.TinyProgram.entity.diary;

import java.util.Date;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 19:09 2020/5/14
 */
public class Diary {
    private int id;
    private int bid;
    private String title;
    private String inside;
    private Date date;
    private String picUrl;
    private String path;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "id=" + id +
                ", bid=" + bid +
                ", title='" + title + '\'' +
                ", inside='" + inside + '\'' +
                ", date=" + date +
                ", picUrl='" + picUrl + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
