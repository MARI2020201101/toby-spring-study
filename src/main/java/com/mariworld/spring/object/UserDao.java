package com.mariworld.spring.object;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class UserDao {
    //외부 주입을 활용하여 런타임시에 관계설정을 한다. 관심사 분리
    private final ConnectionMaker con;

    public User get(long id){
        getConnection();
        return con.selectUser();
    }
    public void add(User user){
        getConnection();
        System.out.println(user.getName() + "was added ");
    }
    public void getConnection(){
        con.makeConnection();
    }
}
