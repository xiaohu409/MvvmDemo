package com.github.hutao.mvvmdemo.mvvm.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.github.hutao.mvvmdemo.mvvm.model.api.TMApiManager;
import com.github.hutao.mvvmdemo.mvvm.model.bean.LoginBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 项目名称：     PLCX
 * 文件名：       LoginViewModel
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/30
 * 版本：         v1.0
 */
public class LoginViewModel extends AndroidViewModel {

    private MutableLiveData<LoginBean> data;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        data = new MutableLiveData<>();
    }

    public MutableLiveData<LoginBean> getData() {
        return data;
    }

    //登录
    public void login(Map<String, Object> param) {
        TMApiManager.newInstance().getApi().login(param).enqueue(new Callback<LoginBean>() {
            @Override
            public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<LoginBean> call, Throwable t) {

            }
        });
    }
}
