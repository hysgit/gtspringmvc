package com.woslx.springmvc.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hy
 * Date: 16-5-5.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String Hello() {
        System.out.println("HelloWorld!");
        return "success";
    }

    @RequestMapping("/helloworld2")
    @ResponseBody
    public String Hello2() {
        System.out.println("HelloWorld2!");
        return "success";
    }
}
