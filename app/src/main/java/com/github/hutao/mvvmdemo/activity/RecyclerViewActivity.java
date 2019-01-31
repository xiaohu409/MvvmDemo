package com.github.hutao.mvvmdemo.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

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

    private List<ListBean.RowBean> rowBeanList;
    private RecyclerItemAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
        bindData();
    }

    @Override
    public void initUI() {
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        binding.recyclerViewId.setLayoutManager(new LinearLayoutManager(this));
        rowBeanList = new ArrayList<>();
        recyclerAdapter = new RecyclerItemAdapter(this, rowBeanList);
        binding.recyclerViewId.setAdapter(recyclerAdapter);
    }

    @Override
    public void bindData() {
        for (int i = 0; i < 10; i++) {
            ListBean.RowBean bean = new ListBean.RowBean();
            bean.setHead("https://image.34xian.com/Product/2018/06/28/m_9b28d413213a41ff90609f3c6a75e2ba.jpg");
            bean.setUsername("hutao");
            bean.setAge(22);
            bean.setMobile("18624003592");
            bean.setCount(1);
            rowBeanList.add(bean);
        }
        recyclerAdapter.notifyDataSetChanged();
    }
 }
