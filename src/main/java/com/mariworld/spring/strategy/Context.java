package com.mariworld.spring.strategy;

public class Context {

    public void workWithStatementStrategy(StatementStrategy st){
        System.out.println("make connection.....");
        st.makeStatement();
        System.out.println("close.....");
    }
}
