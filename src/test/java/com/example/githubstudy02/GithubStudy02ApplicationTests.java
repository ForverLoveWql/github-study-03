package com.example.githubstudy02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubStudy02ApplicationTests {
    @Autowired
    private User user;

    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
