package com.houtianyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@org.springframework.stereotype.Controller
public class FirstController implements Controller {
    @RequestMapping("/firstController")
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg" , "这是我的第一个spring MVC程序");

        return mav;
        qwejqkgwdiygaksdghkja;

    }

}