package com.example.administrator.daggerdemo.component;

import com.example.administrator.daggerdemo.MyApplication;
import com.example.administrator.daggerdemo.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liberty on 2019/1/13.
 */

@Component(
        modules = {
                AppModule.class
        }
)
@Singleton
public interface AppComponent {

    MyApplication inject(MyApplication application);
}
