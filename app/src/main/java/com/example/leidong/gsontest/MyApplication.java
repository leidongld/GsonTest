package com.example.leidong.gsontest;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by leidong on 2017/3/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(this);

        ImageLoader.getInstance().init(configuration);
    }
}
