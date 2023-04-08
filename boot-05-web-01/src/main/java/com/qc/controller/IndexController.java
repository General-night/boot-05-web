package com.qc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/8/16:10
 */

@Slf4j(topic = "indexController")
@RestController
public class IndexController {

    @GetMapping("/1.jpg")
    public String jpg() {

        return "index！";
    }

    @GetMapping(value = "/user")
    public String getUser() {
        return "GET-张三";
    }

    @PostMapping(value = "/user")
    public String saveUser() {
        return "POST-张三";
    }


    @PutMapping(value = "/user")
    public String putUser() {
        return "PUT-张三";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser() {

        return "DELETE-张三";
    }
}
