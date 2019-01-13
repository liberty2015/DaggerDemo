package com.example.administrator.daggerdemo;

import android.os.Build;

import javax.inject.Inject;

/**
 * Created by liberty on 2019/1/13.
 */

public class OSHelper {

    @Inject
    public OSHelper(){

    }

    public String getDeviceBrand(){
        return Build.BRAND;
    }
}
