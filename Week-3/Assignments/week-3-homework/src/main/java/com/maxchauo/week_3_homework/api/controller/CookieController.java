package com.maxchauo.week_3_homework.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;





@Controller
public class CookieController {

    @GetMapping("/myName")
    public String myName(@CookieValue( name="name",required = false)String name, Model model) {
        model.addAttribute("name", name);
        return "CookieView";
    }

    @GetMapping("/trackName")
    public String trackName(@RequestParam(name="name",required = false)String name, HttpServletResponse response, Model model) {
        Cookie cookie = new Cookie("name", name);
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
        model.addAttribute("name", name);
        return "redirect:/myName";
    }

}
