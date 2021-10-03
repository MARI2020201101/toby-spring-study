package com.mariworld.spring.strategy;

public class UserDao {

    public void contextWithStatementStrategy(StatementStrategy st){
        System.out.println("context...");
        st.makeStatement();
        System.out.println("Handle Exception....");
    }
}
