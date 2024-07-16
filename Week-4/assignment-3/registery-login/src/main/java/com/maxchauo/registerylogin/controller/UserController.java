package com.maxchauo.registerylogin.controller;
import com.maxchauo.registerylogin.dto.UserDto;
import com.maxchauo.registerylogin.model.User;
import com.maxchauo.registerylogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    @PostMapping("/register")
    public String createUser(UserDto userDto, Model model) {
        User duplicatedUser = userService.getUserByEmail(userDto.getEmail());
        if (duplicatedUser != null) {
            model.addAttribute("registerText", "Your email is already registered!!"+userDto.getEmail());
            return "homePage";
        }

        User newUser = userService.createUser(userDto.getEmail(), userDto.getPassword());
        if (newUser != null) {
            model.addAttribute("entered", "You registered successfully!" + userDto.getEmail());
            return "memberPage";
        } else {
            model.addAttribute("registerText", "Create user failed " + userDto.getEmail());
            return "homePage";
        }
    }


    @PostMapping("/login")
    public String getUser(UserDto userDto, Model model) {
        User existingUser = userService.authenticateUser(userDto.getEmail(), userDto.getPassword());
        if (existingUser == null) {
            model.addAttribute("loginText", "User does not exist or wrong password!! " + userDto.getEmail());
            return "homePage";
        } else {
            model.addAttribute("entered", "You login successfully!! " + userDto.getEmail());
            return "memberPage";
        }
    }
}


