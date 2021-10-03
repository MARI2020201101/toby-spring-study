package com.mariworld.spring.object;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
public class contextTest {

    @Test
    public void applicationContextTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CounterDaoFactory.class);
        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean.toString());
        }
    }

}
