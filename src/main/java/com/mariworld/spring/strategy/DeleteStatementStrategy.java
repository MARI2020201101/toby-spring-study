package com.mariworld.spring.strategy;

public class DeleteStatementStrategy implements StatementStrategy{
    @Override
    public String makeStatement() {
        return "delete all from user";
    }
}
