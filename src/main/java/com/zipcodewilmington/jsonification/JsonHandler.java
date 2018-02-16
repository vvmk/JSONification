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

    // Instruction test methods

    public void instruction0() {
        //import the Jackson maven dependency
        //write a method `getMapper` that returns a JsonObjectMapper object
        //write the test
    }

    public void instruction1() {
        //create a POJO with 2 fields (i.e. a `User` with a `String name` and `Date joinedOn`
       //use JsonObjectMapper to serialize the data to a JSON String
       //write the string to a file
       //your test will need to be able to read the file
    }

    public Post instruction2() {
        // read json String from a text file
        // deserialize to a json object
        // your test will need to write a test file, and sufficiently test the **java object** returned
        return null;
    }

    public void instruction3() {
        // read json String from a text file
        // change the value of one of the fields (i.e. change a user's name or bio)
        // write updated object to a file (beware append flag if using the same file)
        // test will need to read the file for the change (test the **json**  not the object)
    }

    public void instruction4() {
        // update the original java object to include a 3rd field that is some subclass of `Collection`
        // serialize the new object to json (write it to file and test, this still only counts as one)
        // read the json from file and deserialize it to java.
        // add a new entry to the `Collection` property
        // serialize the object and write it to file
        // test the updated object
        // you may update previous methods but do so on a separate branch
    }

    public void instruction5() {
        // create an `Object` that will hold at least 3 instances of your previous `Object`
            //i.e. if your original class was `User`, maybe use `Channel`
        // store your objects in some `Map`
        // serialize to JSON, write to file, test
        // given that json object as an input, **remove** one of the child objects and serialize back to json
        // write to file, test, etc.
    }
}
