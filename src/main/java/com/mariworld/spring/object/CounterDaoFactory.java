package com.mariworld.spring.object;

import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CounterDaoFactory {
    private ConnectionMaker con;


    public UserDao userDao(){
        UserDao userDao = new UserDao(countingConnectionMaker());
        return userDao;
    }


    public ConnectionMaker countingConnectionMaker(){
        con = new CountingConnectionMaker(connectionMaker());
        return con;
    }

    private ConnectionMaker connectionMaker(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"kim"));
        userList.add(new User(2L,"lee"));
        userList.add(new User(3L,"park"));
        userList.add(new User(4L,"jung"));
        con = new DConnectionMaker();
        con.initUser(userList);
        return con;
    }

}
