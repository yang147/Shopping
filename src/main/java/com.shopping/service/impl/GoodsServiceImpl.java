package com.shopping.service.impl;

import com.shopping.dao.IGoodsDao;
import com.shopping.domain.Goods;
import com.shopping.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:yc
 * Date:2018/12/21
 * Time:0:56
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    IGoodsDao goodsDao;

    /**
     * 轮换图获取
     * @return
     */
    @Override
    public List<Goods> getTurnPicture() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList = goodsDao.selectGoodsByType(1);
        return goodsList;
    }

    /**
     * 最近新品图片获取
     * @return
     */
    @Override
    public List<Goods> getNewPicture() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList = goodsDao.selectGoodsByType(0);
        return goodsList;
    }

    @Override
    public Goods getGoodsDetail(Integer Id) {
        Goods goods = new Goods();
        goods = goodsDao.selectGoodsById(Id);
        return goods;
    }
}
