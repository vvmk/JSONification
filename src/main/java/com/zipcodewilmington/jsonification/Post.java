package com.zipcodewilmington.jsonification;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Date;

/**
 * filename:
 * project: com.zipcodewilmington.jsonification.JSONification
 * author: https://github.com/vvmk
 * date: 2/15/18
 */
public class Post {
    private String author;
    private String body;
    private Date createdAt;
    public static final int fCHAR_MAX = 140;

    public Post(String author, String body) {
        this.author = author;
        this.body = body;
        createdAt = new Date(System.currentTimeMillis());
    }

    public Post(String body) {
        this("anonymous", body);
    }

    public Post() {
        this("");
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
