package com.codewithanurag.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${spring.application.userName}")
    private String name;
    @RequestMapping("/")
    public String index(){
        String viewName=getViewName();
        return viewName;

    }
    private String getViewName(){
        System.out.println(appName);
        System.out.println("username is "+name);
        return "index.html";
    }
}
