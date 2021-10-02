package com.mariworld.spring.object;

public class NConnectionMaker implements ConnectionMaker{
    @Override
    public void makeConnection() {
        System.out.println("n - make connection");
    }

    @Override
    public User selectUser() {
        return userList.get((int) (Math.random()*4));
    }
}
