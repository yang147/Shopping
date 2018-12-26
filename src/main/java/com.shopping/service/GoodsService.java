package com.shopping.service;

import com.shopping.domain.Goods;

import java.util.List;

/**
 * Created with IDEA
 * author:yc
 * Date:2018/12/21
 * Time:0:55
 */
public interface GoodsService {


    List<Goods> getTurnPicture();

    List<Goods> getNewPicture();

    Goods getGoodsDetail(Integer Id);



}
