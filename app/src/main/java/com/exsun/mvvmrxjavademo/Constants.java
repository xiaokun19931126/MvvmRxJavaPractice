package com.exsun.mvvmrxjavademo;

import java.io.File;

/**
 * Created by 肖坤 on 2017/9/25.
 * company：exsun
 * email：838494268@qq.com
 */

class Constants
{
    //================= PATH ====================
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + File.separator + "NetCache";
}
