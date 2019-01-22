package com.github.hutao.mvvmdemo.bean;

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

    public static class RowBean {

        private String username;
        private int age;
        private String mobile;


        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }
}
