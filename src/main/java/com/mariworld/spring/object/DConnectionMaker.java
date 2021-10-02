package com.mariworld.spring.object;

public class DConnectionMaker implements ConnectionMaker{
    @Override
    public void makeConnection() {
        System.out.println("d - make connection");
    }

    @Override
    public User selectUser() {
        return userList.get((int) (Math.random()*4));
    }
}
