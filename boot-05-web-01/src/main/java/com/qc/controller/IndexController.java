package com.qc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/8/16:10
 */

@Slf4j(topic = "indexController")
@RestController
public class IndexController {

    @GetMapping("/1.jpg")
    public String index() {

        return "index！";
    }
}
