package com.github.hutao.mvvmdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.hutao.mvvmdemo.activity.RecyclerViewActivity;
import com.github.hutao.mvvmdemo.base.BaseI;
import com.github.hutao.mvvmdemo.databinding.ActivityMainBinding;
import com.github.hutao.mvvmdemo.mvvm.view.LoginActivity;


/**
 * 文件名：MainActivity.java
 * 描述：
 * 作者：  hutao
 * 日期：  2018/12/8
 * 版本：  v1.0
 */
public class MainActivity extends AppCompatActivity implements BaseI, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
        bindData();
    }

    @Override
    public void initUI() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerViewBtnId.setOnClickListener(this);
        binding.loginBtnId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.recycler_view_btn_id:
                //recycler view;
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
            case R.id.login_btn_id:
                //login
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }

    @Override
    public void bindData() {

    }

}
