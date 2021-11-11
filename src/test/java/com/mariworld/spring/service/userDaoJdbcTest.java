package com.mariworld.spring.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
public class userDaoJdbcTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ResourceLoader resourceLoader;
    @Test
    public void beanTest(){
        Assert.assertNotNull(applicationContext);
    }
}
