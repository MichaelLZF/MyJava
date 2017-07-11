package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ProductDao;
import com.ssh.domain.Product;

@Transactional
public class ProductService {
    private ProductDao productDao;

    //spring框架中的构造的方式注入bean： productDao
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public boolean save(Product product) {
        System.out.println("ProductService.save()方法被执行....");
        productDao.save(product);
        return true;
    }

}