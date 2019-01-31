package com.github.hutao.mvvmdemo.mvvm.model.bean;

/**
 * 登录bean
 */
public class LoginBean {


    /**
     * IsError : false
     * IsWarn : false
     * Message : ok
     * Data : 6628cc4f-daeb-4275-bc38-acabc863a3da
     */

    private boolean IsError;
    private boolean IsWarn;
    private String Message;
    private String Data;

    public boolean isIsError() {
        return IsError;
    }

    public void setIsError(boolean IsError) {
        this.IsError = IsError;
    }

    public boolean isIsWarn() {
        return IsWarn;
    }

    public void setIsWarn(boolean IsWarn) {
        this.IsWarn = IsWarn;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
}
