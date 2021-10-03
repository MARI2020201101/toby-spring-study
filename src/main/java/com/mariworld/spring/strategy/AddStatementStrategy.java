package com.mariworld.spring.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddStatementStrategy implements StatementStrategy{
    private User user;


    @Override
    public String makeStatement() {
        return "insert into " + user.getName() + " user";
    }
}
