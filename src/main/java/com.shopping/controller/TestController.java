package com.shopping.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.domain.User;
import com.shopping.dto.ResultEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value="/dep",method=RequestMethod.GET)
    @ResponseBody
    public List selectUser(@RequestParam(required = false, value = "temp")String temp){
        System.currentTimeMillis();
        List<String> list = new ArrayList<String>();
        list.add("/image/s1.png");
        list.add("/image/s2.png");
        list.add("/image/s3.png");
//        return new ResultEntity<>("200","success","/image/s1.png");
        return list;
    }

}
