package com.zipcodewilmington.jsonification;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * filename:
 * project: JSONification
 * author: https://github.com/vvmk
 * date: 2/15/18
 */
public class JsonHandler {
    private Map<String, User> users;
    private ArrayList<String> channels;

    public JsonHandler() {
        users = new HashMap<>();
        channels = new ArrayList<>();
    }

    @JsonAnyGetter
    public Map<String, User> getUsers() {
        return users;
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public User getUser(String name) {
        return users.get(name);
    }

    public void addChannel(String channel) {
        channels.add(channel);
    }


}
