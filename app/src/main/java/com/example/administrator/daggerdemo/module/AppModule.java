package com.example.administrator.daggerdemo.module;

import android.app.Application;
import android.content.Context;

import com.example.administrator.daggerdemo.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liberty on 2019/1/12.
 */

@Module
public class AppModule {

    private MyApplication myApplication;

    public AppModule(MyApplication application){
        this.myApplication=application;
    }

    @Provides
    @Singleton
    Application providesApplication(){
        return myApplication;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return myApplication;
    }

}
