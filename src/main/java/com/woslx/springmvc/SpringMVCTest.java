package com.woslx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hy on 16-5-6.
 */

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    @RequestMapping(value="/testMethod",method = {RequestMethod.POST, RequestMethod.GET})
    public String testMethod()
    {
        System.out.println("testMethod");
        return "success";
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping()
    {
        System.out.println("testRequestMapping");
        return "success";
    }
}
