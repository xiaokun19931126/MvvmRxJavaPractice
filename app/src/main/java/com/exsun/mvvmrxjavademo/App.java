package com.exsun.mvvmrxjavademo;

import android.app.Application;

/**
 * Created by 肖坤 on 2017/9/25.
 * company：exsun
 * email：838494268@qq.com
 */

public class App extends Application
{
    private static App instance;

    public static App getInstance()
    {
        return instance;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
    }
}
