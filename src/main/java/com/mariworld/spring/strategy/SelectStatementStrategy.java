package com.mariworld.spring.strategy;

public class SelectStatementStrategy implements StatementStrategy{
    @Override
    public String makeStatement() {
        return "select * from user";
    }
}
