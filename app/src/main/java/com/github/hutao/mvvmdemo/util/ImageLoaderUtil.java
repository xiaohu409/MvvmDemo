package com.github.hutao.mvvmdemo.util;

import android.content.Context;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * 项目名称：     MvvmDemo
 * 文件名：       $FileName$
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/29
 * 版本：         v1.0
 */
public class ImageLoaderUtil {

    public static void initImageLoaderUtil(Context context) {
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(context).build();
        ImageLoader.getInstance().init(configuration);
    }

    public static void displayImage(String url, ImageView imageView) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }
}
