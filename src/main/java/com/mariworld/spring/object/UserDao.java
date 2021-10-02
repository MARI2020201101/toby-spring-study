package com.mariworld.spring.object;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class UserDao {
    private final ConnectionMaker con;

    public User get(long id){
         return con.selectUser();
    }
    public void add(User user){
        System.out.println(user.getName() + "was added ");
    }
    public void getConnection(){
        con.makeConnection();
    }
}
