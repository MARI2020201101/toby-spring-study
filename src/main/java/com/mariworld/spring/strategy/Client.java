package com.mariworld.spring.strategy;

public class Client {

    private UserDao userDao = new UserDao(new Context());

    public void deleteAll(){
        StatementStrategy st = new DeleteStatementStrategy();
        userDao.contextWithStatementStrategy(st);
    }

    public void addUser(){
        StatementStrategy st = new AddStatementStrategy(new User(5L,"min"));
        userDao.contextWithStatementStrategy(st);
    }

    public void add(final User user){
        class AddStatementStrategy implements StatementStrategy{
            @Override
            public String makeStatement() {
                return "insert into "+ user.getName() + " user";
            }
        }
        userDao.contextWithStatementStrategy(new AddStatementStrategy());
    }

    public void add2(final User user){
        userDao.contextWithStatementStrategy(()-> "insert into "+ user.getName() + " user");
    }
}
