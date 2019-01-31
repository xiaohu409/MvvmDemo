package com.github.hutao.mvvmdemo.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

/**
 * 项目名称：     MvvmDemo
 * 文件名：       $FileName$
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/29
 * 版本：         v1.0
 */
public class GlideUtil {

    private static RequestManager requestManager;

    public static void initGlide(Context context) {
       requestManager = Glide.with(context);
    }

    public static void loadImage(String url, ImageView imageView) {
        requestManager.load(url).into(imageView);
    }
}
