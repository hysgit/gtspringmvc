package com.woslx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hy on 16-5-6.
 */

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    @RequestMapping("/deleted/{id}")
    public String deleted(@PathVariable("id") Integer id) {
        System.out.println("deleted/"+id);
        return "success";
    }

    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath()
    {
        System.out.println("testAntPath");
        return "success";
    }

    @RequestMapping(value="/testParamAndHeaders",
                    params = {"username", "age!=10"},
                    headers = {"Accept-Language=zh-CN,zh;q=0.8"})
    public String testParamAndHeaders()
    {
        System.out.println("testParamAndHeaders");
        return "success";
    }

    @RequestMapping(value = "/testMethod", method = {RequestMethod.POST, RequestMethod.GET})
    public String testMethod() {

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
