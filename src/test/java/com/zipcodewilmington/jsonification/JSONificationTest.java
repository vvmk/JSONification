package com.zipcodewilmington.jsonification;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: com.zipcodewilmington.jsonification.JSONification
 * author: https://github.com/vvmk
 * date: 2/14/18
 */
public class JSONificationTest {
    private JsonHandler handler;
    private ObjectMapper mapper;
    private User user1;
    private User user2;
    private User user3;

    @Before
    public void setup() {

        // Given:

        handler = new JsonHandler();
        mapper = new ObjectMapper();

        user1 = new User("Spock", "If there are self-made purgatories, we must all live in them");
        user2 = new User("Dr. Leonard McCoy", "I'm a doctor, not an escalator!");
        user3 = new User("Montgomery Scott", "The haggis is in the fire now for sure.");

        user1.createPost(new Post(user1.getName(), "I have never understood the female capacity to avoid a direct answer to any question."));
        user2.createPost(new Post(user2.getName(), "You're out of your Vulcan Mind"));
        user3.createPost(new Post(user3.getName(), "N..C..C.. 1..7..0..1, no bloody A, B, C or D."));

        handler.addUser(user1);
        handler.addUser(user2);
        handler.addUser(user3);

        handler.addChannel("Ten Forward");
        handler.addChannel("Jefferies Tube");
        handler.addChannel("Engineering");
    }

    @Test
    public void testPOJOtoJSON() throws JsonProcessingException {
        String expected = "{\"channels\":[\"Ten Forward\",\"Jefferies Tube\",\"Engineering\"],\"Dr. Leonard McCoy\":{\"name\":\"Dr. Leonard McCoy\",\"bio\":\"I'm a doctor, not an escalator!\",\"joinedOn\":1518752872664,\"posts\":[{\"author\":\"Dr. Leonard McCoy\",\"body\":\"You're out of your Vulcan Mind\",\"createdAt\":\"Thu Feb 15 22:47:52 EST 2018\"}]},\"Montgomery Scott\":{\"name\":\"Montgomery Scott\",\"bio\":\"The haggis is in the fire now for sure.\",\"joinedOn\":1518752872664,\"posts\":[{\"author\":\"Montgomery Scott\",\"body\":\"N..C..C.. 1..7..0..1, no bloody A, B, C or D.\",\"createdAt\":\"Thu Feb 15 22:47:52 EST 2018\"}]},\"Spock\":{\"name\":\"Spock\",\"bio\":\"If there are self-made purgatories, we must all live in them\",\"joinedOn\":1518752872664,\"posts\":[{\"author\":\"Spock\",\"body\":\"I have never understood the female capacity to avoid a direct answer to any question.\",\"createdAt\":\"Thu Feb 15 22:47:52 EST 2018\"}]}}\n";
        String actual = mapper.writeValueAsString(handler);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}
