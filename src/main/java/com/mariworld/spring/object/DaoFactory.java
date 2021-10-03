package com.mariworld.spring.object;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class DaoFactory {
    //생성 책임을 분리한다.
    private ConnectionMaker con;

    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }
    @Bean
    public UserDao2 userDao2(){
        UserDao2 userDao2 = new UserDao2(connectionMaker());
        return userDao2;
    }

    private ConnectionMaker connectionMaker(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"kim"));
        userList.add(new User(2L,"lee"));
        userList.add(new User(3L,"park"));
        userList.add(new User(4L,"jung"));
        con = new NConnectionMaker();
        con.initUser(userList);
        return con;
    }
}
