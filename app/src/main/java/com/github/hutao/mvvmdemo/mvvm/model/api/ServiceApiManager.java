package com.github.hutao.mvvmdemo.mvvm.model.api;

import com.github.hutao.mvvmdemo.mvvm.util.RetrofitUtil;

import retrofit2.Retrofit;

/**
 * 项目名称：     MvvmDemo
 * 文件名：       ServiceApiManager
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/2/14
 * 版本：         v1.0
 */
public class ServiceApiManager {

    private static ServiceApiManager apiManager;

    private ServiceApi api;

    private ServiceApiManager() {
        Retrofit retrofit = RetrofitUtil.newInstance().getRetrofit();
        api = retrofit.create(ServiceApi.class);
    }

    public static ServiceApiManager newInstance() {
        if (apiManager == null) {
            synchronized (ServiceApiManager.class) {
                if (apiManager == null) {
                    apiManager = new ServiceApiManager();
                }
            }
        }
        return apiManager;
    }

    public ServiceApi getApi() {
        return api;
    }
}
