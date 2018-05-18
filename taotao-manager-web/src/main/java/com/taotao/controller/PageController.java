package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName:PageController
 * Author:  ghw06
 * Date:    2018/5/18 11:49
 * Description: 首页跳转
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
