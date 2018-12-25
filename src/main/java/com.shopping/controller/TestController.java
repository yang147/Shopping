package com.shopping.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.domain.Goods;
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

    @RequestMapping(value="/dep2",method=RequestMethod.GET)
    @ResponseBody
    public List selectUser2(){
        List<Goods> list = new ArrayList<Goods>();
        Goods goods1 = new Goods();
        goods1.setId(1);
        goods1.setName("苹果");
        goods1.setPrice(10.0f);
        goods1.setUrl("/image/s1.png");
        Goods goods2 = new Goods();
        goods2.setName("香蕉");
        goods2.setPrice(10.0f);
        goods2.setUrl("/image/s2.png");
        Goods goods3 = new Goods();
        goods3.setName("梨子");
        goods3.setPrice(10.0f);
        goods3.setUrl("/image/s3.png");
        Goods goods4 = new Goods();
        goods4.setName("苹果");
        goods4.setPrice(10.0f);
        goods4.setUrl("/image/s1.png");
        Goods goods5 = new Goods();
        goods5.setName("苹果");
        goods5.setPrice(10.0f);
        goods5.setUrl("/image/s1.png");
        Goods goods6 = new Goods();
        goods6.setName("苹果");
        goods6.setPrice(10.0f);
        goods6.setUrl("/image/s1.png");

        list.add(goods1);
        list.add(goods2);
        list.add(goods3);
        list.add(goods4);
        list.add(goods5);
        list.add(goods6);

        return list;
    }


}
