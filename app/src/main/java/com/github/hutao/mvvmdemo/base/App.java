package com.github.hutao.mvvmdemo.base;

import android.app.Application;

import com.github.hutao.mvvmdemo.util.GlideUtil;
import com.github.hutao.mvvmdemo.util.ImageLoaderUtil;

/**
 * 项目名称：     MvvmDemo
 * 文件名：       $FileName$
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/29
 * 版本：         v1.0
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.initImageLoaderUtil(this);
        GlideUtil.initGlide(this);
    }
}
