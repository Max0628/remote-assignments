package com.maxchauo.registerylogin.service;//service interface


import com.maxchauo.registerylogin.model.User;

public interface UserService {


    User getUserByEmail(String email);

    User createUser(String email, String password);

    User authenticateUser(String email, String password);


}
