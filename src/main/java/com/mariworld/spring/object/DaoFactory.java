package com.mariworld.spring.object;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class DaoFactory {
    private ConnectionMaker con;

    public UserDao userDao(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"kim"));
        userList.add(new User(2L,"lee"));
        userList.add(new User(3L,"park"));
        userList.add(new User(4L,"jung"));
        con = new NConnectionMaker();
        UserDao userDao = new UserDao(con);
        con.initUser(userList);
        return userDao;
    }
}
