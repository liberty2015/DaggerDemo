package com.example.administrator.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.daggerdemo.bean.Factory;
import com.example.administrator.daggerdemo.component.ActivityComponent;
import com.example.administrator.daggerdemo.component.DaggerActivityComponent;
import com.example.administrator.daggerdemo.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    //Dagger 对于需要注入的变量不支持私有
    @Inject
    OSHelper osHelper;

    @Inject
    Factory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .appComponent(((MyApplication) getApplication()).getAppComponent())
                .activityModule(new ActivityModule())
                .build();

        activityComponent.inject(this);
//        osHelper = activityComponent.getOSHelper();

        Log.d(TAG, "onCreate: " + osHelper.getDeviceBrand());

        Log.d(TAG,"onCreate: "+factory.hashCode()+"\n"+factory.product.hashCode());
    }
}
