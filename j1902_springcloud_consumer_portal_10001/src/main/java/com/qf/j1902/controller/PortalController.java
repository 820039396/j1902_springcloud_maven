package com.qf.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by funkh on 2019/7/17.
 */
@Controller
public class PortalController {
    @RequestMapping("header.html")
    public String showInfo(){
        return "header.html";
    }
    @RequestMapping("footer.html")
    public String showInfo2(){
        return "footer.html";
    }
}
