package com.mariworld.spring.object;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {
    private List<User> userList = new ArrayList<>();
    private UserDao userDao;
    private ConnectionMaker con;

    @Before
    public void setUp(){
        userList.add(new User(1L,"kim"));
        userList.add(new User(2L,"lee"));
        userList.add(new User(3L,"park"));
        userList.add(new User(4L,"jung"));
        con = new NConnectionMaker();
        userDao = new UserDao(con);
        con.initUser(userList);
    }

    @Test
    public void testGetUser(){
        System.out.println(userDao.get(1L));
    }


}
