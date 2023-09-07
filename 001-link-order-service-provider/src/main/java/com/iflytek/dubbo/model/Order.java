package com.iflytek.dubbo.model;


import java.io.Serializable;

/**
 * @Author 不良使
 * @Date 2023/9/5 11:43
 * @Version 1.0
 * @Description TODO  这是生产者的实体类对象
 */
public class Order implements Serializable {
    private Integer id;
    private String goodsName;
    private String price;
    private String amount;

    public Order() {
    }

    public Order(Integer id, String goodsName, String price, String amount) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return Objects.equals(id, order.id) && Objects.equals(goodsName, order.goodsName) && Objects.equals(price, order.price) && Objects.equals(amount, order.amount);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, goodsName, price, amount);
//    }


}
