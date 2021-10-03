package com.mariworld.spring.object;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountingUserDaoTest {

    @Test
    public void testCountingUserDao(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CounterDaoFactory.class);
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        CountingConnectionMaker ccm = applicationContext.getBean("countingConnectionMaker",CountingConnectionMaker.class);
        userDao.get(1L);
        Assert.assertEquals(1,ccm.getCounter());

    }
}
