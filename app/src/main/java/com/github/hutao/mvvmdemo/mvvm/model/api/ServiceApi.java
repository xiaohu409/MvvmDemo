package com.github.hutao.mvvmdemo.mvvm.model.api;


import com.github.hutao.mvvmdemo.mvvm.model.bean.LoginBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * 项目名称：
 * 文件名：       TMApi
 * 描述：
 * 作者：         胡涛
 * 日期：         2019/1/30
 * 版本：         v1.0
 */
public interface ServiceApi {

    String IP = "https://madmin.jx.34xian.com";

    /**
     * 登录接口
     * @param param
     * @return
     */
    String Login = "/api/Login/Login";
    @POST(Login)
    @FormUrlEncoded
    Call<LoginBean> login(@FieldMap Map<String, Object> param);
}
