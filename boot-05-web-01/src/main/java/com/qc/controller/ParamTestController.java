package com.qc.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/8/21:38
 */

@Slf4j
@RestController
public class ParamTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable String id, @PathVariable String username, @PathVariable Map<String, String> pv, @RequestHeader("User-Agent") String userAgent, @RequestHeader HttpHeaders httpHeaders) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("username", username);
        map.put("pv", pv);
        map.put("userAgent", userAgent);
        map.put("httpHeaders", httpHeaders);
        //map.put("cookie", JSON.toJSONString(httpCookie));
        //log.info("cookie is {}", httpCookie);

        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> save(Person person) {
        Map<String, Object> map = new HashMap<>();
        //map.put("content", content);
        //map.put("pv", pv);
        map.put("person", person);

        return map;
    }

    @GetMapping("/rp")
    public Map<String, Object> rp(@RequestParam Map<String, String> pv) {
        Map<String, Object> map = new HashMap<>();
        map.put("rp", pv);

        return map;
    }
}

@Data
class Person {
    private String name;
    private Integer age;
}
