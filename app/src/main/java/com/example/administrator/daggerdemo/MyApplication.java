package com.example.administrator.daggerdemo;

import android.app.Application;

import com.example.administrator.daggerdemo.component.AppComponent;
import com.example.administrator.daggerdemo.component.DaggerAppComponent;
import com.example.administrator.daggerdemo.module.AppModule;

/**
 * Created by liberty on 2019/1/13.
 */

public class MyApplication extends Application {

    AppComponent appComponent=null;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent= DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
