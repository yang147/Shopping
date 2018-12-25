package com.shopping.dao;

import com.shopping.domain.Goods;

import java.util.List;

/**
 * Created with IDEA
 * author:yc
 * Date:2018/12/25
 * Time:1:37
 */
public interface IGoodsDao {

    List<Goods> selectGoods(Integer type);



}
