package com.mariworld.spring.object;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    //클라이언트 책임을 분리한다.
    @Test
    public void testGetUser(){
        UserDao userDao = new DaoFactory().userDao();
        System.out.println(userDao.get(1L));
    }

  /*  @Test
    public void testConfiguration(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao);
    }
*/
    @Test
    public void testSingleton(){
        UserDao userDao = new DaoFactory().userDao();
        UserDao userDao2 = new DaoFactory().userDao();
        assertNotEquals(userDao,userDao2);
        System.out.println(userDao);
        System.out.println(userDao2);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao userDao3 = applicationContext.getBean("userDao",UserDao.class);
        UserDao userDao4 = applicationContext.getBean("userDao",UserDao.class);
        assertEquals(userDao3,userDao4);
        System.out.println(userDao3);
        System.out.println(userDao4);

    }

}
