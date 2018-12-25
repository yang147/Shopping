package com.shopping.domain;

/**
 * Created with IDEA
 * author:yc
 * Date:2018/12/25
 * Time:0:59
 */
public class Goods {
    private Integer id;

    //商品名称
    private String name;

    //商品URL地址
    private String url;

    //商品类型
    private Integer type;

    //商品描述
    private String detail;

    //商品正常价格
    private float price;

    //商品团购价
    private float groupprice;

    //商品促销价
    private float offprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getGroupprice() {
        return groupprice;
    }

    public void setGroupprice(float groupprice) {
        this.groupprice = groupprice;
    }

    public float getOffprice() {
        return offprice;
    }

    public void setOffprice(float offprice) {
        this.offprice = offprice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", type=" + type +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", groupprice=" + groupprice +
                ", offprice=" + offprice +
                '}';
    }
}
