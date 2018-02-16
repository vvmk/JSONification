package com.zipcodewilmington.jsonification;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * filename:
 * project: com.zipcodewilmington.jsonification.JSONification
 * author: https://github.com/vvmk
 * date: 2/15/18
 */
public class User {
    private String name;
    private String bio;
    private Date joinedOn;
    private ArrayList<Post> posts;

    public User(String name, String bio) {
        this.name = name;
        this.bio = bio;
        this.joinedOn = new Date(System.currentTimeMillis());
        this.posts = new ArrayList<>();
    }

    public User() {
        this("anonymous", "");
    }

    public void createPost(Post post) {
        posts.add(post);
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getJoinedOn() {
        return joinedOn;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
}
