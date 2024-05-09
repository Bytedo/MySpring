package com.myspring;

import com.myspring.aop.SmartAnimalable;
import com.myspring.component.UserAction;
import com.myspring.component.UserDao;
import com.myspring.component.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppMain {
    public static void main(String[] args) {

        //测试是否可以得到spring容器中的bean , 同时看看依赖注入是否OK
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("beans.xml");
        UserAction userAction = (UserAction) ioc.getBean("userAction");
        UserAction userAction2 = (UserAction) ioc.getBean("userAction");

        System.out.println("userAction=" + userAction);
        System.out.println("userAction2=" + userAction2);

        UserDao userDao = (UserDao) ioc.getBean("userDao");
        System.out.println("userDao=" + userDao);

        UserService userService = (UserService) ioc.getBean("userService");
        System.out.println("userService=" + userService);

        //测试依赖注入
        userService.m1();

        //测试AOP
        SmartAnimalable smartDog = ioc.getBean(SmartAnimalable.class);
        smartDog.getSum(10, 2);


    }
}
