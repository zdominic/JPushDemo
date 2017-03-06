package com.example.dominic.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Dominic on 2017/3/6.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
