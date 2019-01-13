package com.example.administrator.daggerdemo.component;

import com.example.administrator.daggerdemo.MainActivity;
import com.example.administrator.daggerdemo.annotation.ScopeActivity;
import com.example.administrator.daggerdemo.module.ActivityModule;

import dagger.Component;

/**
 * Created by liberty on 2019/1/13.
 */

@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
@ScopeActivity
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
//    OSHelper getOSHelper();
}
