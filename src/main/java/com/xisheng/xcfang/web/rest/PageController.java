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
    public String index() {
        return "index.html";
    }

}
