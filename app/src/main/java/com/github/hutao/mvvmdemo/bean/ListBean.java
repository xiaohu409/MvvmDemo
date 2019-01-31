package com.github.hutao.mvvmdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.github.hutao.mvvmdemo.BR;

import java.util.List;

/**
 * 文件名：ListBean.java
 * 描述：  
 * 作者：  hutao
 * 日期：  2018/12/8
 * 版本：  v1.0
 */
public class ListBean {

    private boolean isError;
    private boolean isWare;
    private String msg;
    private List<RowBean> rowBeanList;


    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public boolean isWare() {
        return isWare;
    }

    public void setWare(boolean ware) {
        isWare = ware;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<RowBean> getRowBeanList() {
        return rowBeanList;
    }

    public void setRowBeanList(List<RowBean> rowBeanList) {
        this.rowBeanList = rowBeanList;
    }

    @Override
    public String toString() {
        return "ListBean{" +
                "isError=" + isError +
                ", isWare=" + isWare +
                ", msg='" + msg + '\'' +
                ", rowBeanList=" + rowBeanList +
                '}';
    }

    public static class RowBean extends BaseObservable {

        private String username;
        private int age;
        private String mobile;
        private String head;
        private int count;

        @Bindable
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        @Bindable
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        @Bindable
        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
        @Bindable
        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }
        @Bindable
        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
            notifyPropertyChanged(BR.count);
        }

        @Override
        public String toString() {
            return "RowBean{" +
                    "username='" + username + '\'' +
                    ", age=" + age +
                    ", mobile='" + mobile + '\'' +
                    ", head='" + head + '\'' +
                    ", count=" + count +
                    '}';
        }
    }
}
