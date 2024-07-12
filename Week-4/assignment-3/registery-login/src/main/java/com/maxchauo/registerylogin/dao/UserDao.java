package com.maxchauo.registerylogin.dao;//Dao interface

import com.maxchauo.registerylogin.model.User;

public interface UserDao {

    User getUserByEmailFromDB(String email);

    User createUser(String email, String password);

    User authenticateUserInDB(String email, String password);

}
