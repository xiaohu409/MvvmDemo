package com.github.hutao.mvvmdemo.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.github.hutao.mvvmdemo.R;
import com.github.hutao.mvvmdemo.adapter.RecyclerItemAdapter;
import com.github.hutao.mvvmdemo.base.BaseI;
import com.github.hutao.mvvmdemo.bean.ListBean;
import com.github.hutao.mvvmdemo.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件名：RecyclerViewActivity.java
 * 描述：
 * 作者：  hutao
 * 日期：  2018/12/8
 * 版本：  v1.0
 */
public class RecyclerViewActivity extends AppCompatActivity implements BaseI {

    private ActivityRecyclerViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
        bindData();
    }

    @Override
    public void initUI() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        binding.recyclerViewId.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void bindData() {
        List<ListBean.RowBean> rowBeanList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ListBean.RowBean bean = new ListBean.RowBean();
            bean.setUsername("hutao");
            bean.setAge(22);
            bean.setMobile("18624003592");
            rowBeanList.add(bean);
        }
        RecyclerItemAdapter recyclerAdapter = new RecyclerItemAdapter(this, rowBeanList);
        binding.setAdapter(recyclerAdapter);
    }
}
