package com.example.administrator.daggerdemo.bean;

import javax.inject.Inject;

/**
 * Created by liberty on 2019/1/13.
 */

public class Factory {

    public Product product;

    @Inject
    public Factory(Product product){
        this.product=product;
    }
}
