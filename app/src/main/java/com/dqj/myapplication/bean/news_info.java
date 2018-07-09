package com.dqj.myapplication.bean;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by 木土其金建 on 2018/5/11.
 */

public class news_info {
    private String title;


    public news_info(String title, String from, String time) {
        this.title = title;
        this.from = from;
        this.time = time;
    }

    public news_info(String title, String from, String time, URL url, Object id, Object temp, Object temp2) {
        this.title = title;
        this.from = from;
        this.time = time;
        this.url = url;
        this.id = id;
        this.temp = temp;
        this.temp2 = temp2;
    }
    public news_info(String title, String from, String time, String url, Object id, Object temp, Object temp2) throws MalformedURLException {
        this.title = title;
        this.from = from;
        this.time = time;
        this.url=new URL(url);
        this.id = id;
        this.temp = temp;
        this.temp2 = temp2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getTemp() {
        return temp;
    }

    public void setTemp(Object temp) {
        this.temp = temp;
    }

    public Object getTemp2() {
        return temp2;
    }

    public void setTemp2(Object temp2) {
        this.temp2 = temp2;
    }

    private String from;
    private String time;
    private URL url;
    private Object id;
    private Object temp;
    private Object temp2;

}
