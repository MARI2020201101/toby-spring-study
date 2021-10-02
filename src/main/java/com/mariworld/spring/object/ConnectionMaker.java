package com.mariworld.spring.object;

import java.util.ArrayList;
import java.util.List;

public interface ConnectionMaker {

    static List<User> userList = new ArrayList<>();

    default void initUser(List<User> users){
        userList.addAll(users);
    }

    void makeConnection();
    User selectUser();
}
