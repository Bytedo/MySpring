package com.myspring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//也可以使用@Service
@Component
public class UserService {

    //定义属性
    //也可以用@Resource
    @Autowired
    private UserDao userDao;

    public void m1() {
        userDao.hi();
    }

    //这里需要指定init() 是初始化方法
    public void init() {
        System.out.println("UserService-init()");
    }

}
