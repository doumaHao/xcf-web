package com.xisheng.xcfang.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Haoxijun | douma
 * @Date: 2019/8/31 0031 18:33
 * @Description:
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String beelt() {
        return "index.html";
    }

    @GetMapping("/index")
    public String index() {
        return "html/index.html";
    }

    @GetMapping("/list")
    public String list() {
        return "html/demo_list.html";
    }

}
