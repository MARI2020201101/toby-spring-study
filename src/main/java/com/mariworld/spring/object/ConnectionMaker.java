package com.mariworld.spring.object;

import java.util.ArrayList;
import java.util.List;

public interface ConnectionMaker {

    //DB 컨넥션 관심사를 분리한다.
    static List<User> userList = new ArrayList<>();

    default void initUser(List<User> users){
        userList.addAll(users);
    }

    void makeConnection();
    User selectUser();
}
