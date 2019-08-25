package com.xisheng.xcfang.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Haoxijun | douma
 * @Date: 2019/8/25 0025 22:19
 * @Description: 主Controller
 */
@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "world";
    }

}
