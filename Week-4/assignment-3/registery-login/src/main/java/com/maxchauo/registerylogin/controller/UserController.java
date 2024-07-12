package com.maxchauo.registerylogin.controller;

import com.maxchauo.registerylogin.dto.UserDto;
import com.maxchauo.registerylogin.model.User;
import com.maxchauo.registerylogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/memberPage")
    public String memberPage() {
        return "memberPage";
    }


    @PostMapping("/register")
    public RedirectView createUser(UserDto userDto) {
        User duplicatedUser = userService.getUserByEmail(userDto.getEmail());
        if (duplicatedUser != null) {
            return new RedirectView("/");
        }

        User newUser = userService.createUser(userDto.getEmail(), userDto.getPassword());
        if (newUser != null) {
            return new RedirectView("/memberPage");
        } else {
            return new RedirectView("/");
        }
    }


    @PostMapping("/login")
    public RedirectView getUser(UserDto userDto) {
        User existingUser = userService.authenticateUser(userDto.getEmail(), userDto.getPassword());
        if (existingUser == null) {
            return new RedirectView("/");
        } else {
            return new RedirectView("/memberPage");
        }
    }


}


