package com.mariworld.spring.object;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDao2 {
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
