package com.woslx.springmvc.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by hy on 16-5-6.
 */

@Controller
@RequestMapping("/springmvc")
public class SpringMVCTest {

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request,
                                 HttpServletResponse response,
                                 HttpSession session)
    {
        System.out.println(request.getSession().getServletContext());
        System.out.println(response.getStatus());
        System.out.println(session.getId());
        System.out.println("testServletAPI");
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al)
    {
        System.out.println("testRequestHeader, "+al);
        return "success";
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParm(@RequestParam(value = "username",required = false) String nu,
                                  @RequestParam(value = "age",required = false) int age) {
        System.out.println(nu + age);
        return "success";
    }

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
