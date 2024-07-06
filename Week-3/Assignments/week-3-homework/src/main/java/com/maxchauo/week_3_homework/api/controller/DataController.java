package com.maxchauo.week_3_homework.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping
    public String dealWithParams(@RequestParam(required = false) String number) {
        if (number == null || number.isEmpty()) {
            return "Lack of Parameter";
        }

        try {
            //use long and Formula to count
            long num = Long.parseLong(number);

            //edge case
            if (num <= 0) {
                return "Wrong Parameter";
            }
            long sum = (1 + num) * num / 2;
            return Long.toString(sum);
        } catch (NumberFormatException e) {
            return "Wrong Parameter";
        }
    }
}
