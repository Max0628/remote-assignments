//service class

package com.maxchauo.registerylogin.service;//service interface

import com.maxchauo.registerylogin.dao.UserDao;
import com.maxchauo.registerylogin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmailFromDB(email);
    }

    @Override
    public User createUser(String email, String password) {
        return userDao.createUser(email, password);
    }


    @Override
    public User authenticateUser(String email, String password) {
        System.out.printf(email,password);
        return userDao.authenticateUserInDB(email, password);
    }
}
