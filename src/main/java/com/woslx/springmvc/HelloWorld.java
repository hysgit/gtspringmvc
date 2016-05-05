package com.woslx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hy
 * Date: 16-5-5.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String Hello() {
        System.out.println("HelloWorld");
        return "success";
    }
}
