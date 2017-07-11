package com.ssh.domain;

/**
 * 
 * 表示商品的实体类
 * @author yun
 *
 */
public class Product {
    private Integer pid;
    private String pname;
    private Double price;
    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }   
}
