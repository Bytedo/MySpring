package com.myspring.component;

import org.springframework.stereotype.Component;

//可以使用@Repository
@Component
public class UserDao {

    public void hi() {
        System.out.println("UserDao-hi()---");
    }
}
