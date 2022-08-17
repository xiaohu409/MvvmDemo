package com.github.hutao.mvvmdemo.mvvm.view;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.github.hutao.mvvmdemo.R;
import com.github.hutao.mvvmdemo.databinding.ActivityLoginBinding;
import com.github.hutao.mvvmdemo.mvvm.model.bean.LoginBean;
import com.github.hutao.mvvmdemo.mvvm.viewmodel.LoginViewModel;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding loginBinding;
    private LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
        bindData();
    }

    private void initUI() {
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginBinding.loginBtnId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn_id:
                //login
                login();
                break;
        }
    }

    private void bindData() {
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        viewModel.getData().observe(this, new Observer<LoginBean>() {
            @Override
            public void onChanged(@Nullable LoginBean loginBean) {
                Toast.makeText(LoginActivity.this, loginBean.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login() {
        String username = loginBinding.usernameEtId.getText().toString();
        String pass = loginBinding.passEtId.getText().toString();
        if (TextUtils.isEmpty(username)) {
            Toast.makeText(this, loginBinding.usernameEtId.getHint().toString(), Toast.LENGTH_SHORT).show();
            loginBinding.usernameEtId.requestFocus();
        }
        else if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, loginBinding.passEtId.getHint().toString(), Toast.LENGTH_SHORT).show();
            loginBinding.passEtId.requestFocus();
        }
        else {
            Map<String, Object> param = new HashMap<>();
            param.put("username", username);
            param.put("password", pass);
//            viewModel.login(param);
            viewModel.login(param);
        }
    }
}
