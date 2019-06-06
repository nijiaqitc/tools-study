package com.njq.load.custom.schemas;

import com.njq.load.custom.schemas.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: nijiaqi
 * @date: 2019/6/5
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User) context.getBean("eric");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSex());
        System.out.println(user.getAge());
    }
}
