package com.github.hutao.mvvmdemo.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.github.hutao.mvvmdemo.mvvm.model.api.ServiceApiManager;
import com.github.hutao.mvvmdemo.mvvm.model.bean.LoginBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 项目名称：
 * 文件名：       LoginViewModel
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/30
 * 版本：         v1.0
 */
public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginBean> data;

    public LoginViewModel() {
        data = new MutableLiveData<>();
    }

    public MutableLiveData<LoginBean> getData() {
        return data;
    }

    //登录
    public void login(Map<String, Object> param) {
        ServiceApiManager.newInstance().getApi().login(param).enqueue(new Callback<LoginBean>() {
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
