package com.mariworld.spring.object;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;


public class CountingUserDaoTest {

    private ApplicationContext applicationContext;
    private UserDao userDao;
    private CountingConnectionMaker ccm;

    @Before
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(CounterDaoFactory.class);
        userDao = applicationContext.getBean("userDao",UserDao.class);
        ccm = applicationContext.getBean("countingConnectionMaker",CountingConnectionMaker.class);
    }

    @Test
    public void testCountingUserDao(){
        userDao.get(1L);
        assertEquals(1,ccm.getCounter());
    }

    @Test(expected = AssertionError.class)
    public void testFail(){
        assertEquals(1,ccm.getCounter());
    }

}
