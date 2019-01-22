package com.github.hutao.mvvmdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.github.hutao.mvvmdemo.R;
import com.github.hutao.mvvmdemo.bean.ListBean;
import com.github.hutao.mvvmdemo.databinding.RecyclerItemBinding;

import java.util.List;

/**
 * 文件名：RecyclerItemAdapter
 * 描述：
 * 作者：  hutao
 * 日期：  2018/12/8
 * 版本：  v1.0
 */
public class RecyclerItemAdapter extends RecyclerView.Adapter<RecyclerItemAdapter.ViewHolder> {

    static class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerItemBinding itemBinding;

        ViewHolder(RecyclerItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }
    }

    private Context context;
    private List<ListBean.RowBean> list;

    public RecyclerItemAdapter(Context context, List<ListBean.RowBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        RecyclerItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.recycler_item, viewGroup, false);
        return new ViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListBean.RowBean bean = list.get(i);
        viewHolder.itemBinding.setItem(bean);
        viewHolder.itemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
