package com.shopping.controller.serviceController;

import com.shopping.domain.Goods;
import com.shopping.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:yc
 * Date:2018/12/26
 * Time:1:01
 */
@Controller
@RequestMapping("/fileservice")
public class GoodsServiceController {

    @Autowired
    GoodsService goodsService;

    /**
     * 获取首页轮换图
     * @return
     */
    @RequestMapping(value="/getTurnPicture",method=RequestMethod.GET)
    @ResponseBody
    public List<Goods> getTurnPicture(){
        List<Goods> goodsList = new ArrayList<>();
        goodsList = goodsService.getTurnPicture();
        return goodsList;
    }

}
