package com.mariworld.spring.object;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {

    //클라이언트 책임을 분리한다.
    @Test
    public void testGetUser(){
        UserDao userDao = new DaoFactory().userDao();
        System.out.println(userDao.get(1L));
    }

    @Test
    public void testConfiguration(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao);
    }


}
