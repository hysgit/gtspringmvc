package com.woslx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hy on 16-5-6.
 */

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping()
    {
        System.out.println("testRequestMapping");
        return "success";
    }
}
