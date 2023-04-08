package com.qc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author：MoneyOrange
 * @Date：2023/4/8/22:26
 */

@Controller
public class RequestController {
    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("msg", "成功了！");
        httpServletRequest.setAttribute("code", 200);

        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> success(@RequestAttribute String msg, @RequestAttribute String code) {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("code", code);

        return map;
    }
}
