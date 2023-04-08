package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/8/15:59
 */

@Slf4j(topic = "Application")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("boot-05-web-01项目已启动>>>");
    }
}
