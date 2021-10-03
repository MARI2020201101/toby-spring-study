package com.mariworld.spring.object;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CountingConnectionMaker implements ConnectionMaker{
    private int counter;
    private ConnectionMaker con;

    public CountingConnectionMaker(ConnectionMaker con){
        this.con=con;
    }

    @Override
    public void makeConnection() {
        counter++;
    }

    @Override
    public User selectUser() {
        return userList.get((int) (Math.random()*4));
    }
}
