package com.github.hutao.mvvmdemo.mvvm.model.api;

import com.github.hutao.mvvmdemo.mvvm.util.RetrofitUtil;

import retrofit2.Retrofit;

/**
 * 项目名称：     MvvmDemo
 * 文件名：       TMApiManager
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/2/14
 * 版本：         v1.0
 */
public class TMApiManager {

    private static TMApiManager apiManager;

    private TMApi api;

    private TMApiManager() {
        Retrofit retrofit = RetrofitUtil.newInstance().getRetrofit();
        api = retrofit.create(TMApi.class);
    }

    public static TMApiManager newInstance() {
        if (apiManager == null) {
            synchronized (TMApiManager.class) {
                if (apiManager == null) {
                    apiManager = new TMApiManager();
                }
            }
        }
        return apiManager;
    }

    public TMApi getApi() {
        return api;
    }
}
