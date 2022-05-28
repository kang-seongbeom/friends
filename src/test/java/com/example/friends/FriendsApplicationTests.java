package com.example.friends;

import com.example.friends.domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FriendsApplicationTests {
    private User user, friends;

    @Autowired
    private FriendsService friendsService;

    @BeforeEach
    public void setUp(){
        user = User.builder()
                .id(1L)
                .username("ksb")
                .password("1234")
                .build();

        friends = User.builder()
                .id(2L)
                .username("kkk")
                .password("1234")
                .build();

    }

    @Test
    public void createUser() {
        friendsService.deleteAll();
        friendsService.saveUser(user);
    }

    @Test
    public void friend(){
        friendsService.deleteAll();
    }


    public void deleteUser(){
        friendsService.deleteAll();
    }


}
