package com.kaitan.service;

import com.kaitan.dao.UserDao;
import com.kaitan.dao.UserDaoImpl;
import com.kaitan.dao.UserDaoMySQLImpl;
import com.kaitan.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{

/*
    //写死了，如果要切换，需要手动更改源代码
    private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoOracleImpl();
    //private UserDao userDao = new UserDaoMySQLImpl();
*/


//    解决方案
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
