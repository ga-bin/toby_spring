package com.spring.user.dao;

public class DaoFactory {
    
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }


    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao MessageDao() {
        return new MessageDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new SimpleConnectionMaker();
    }
}
