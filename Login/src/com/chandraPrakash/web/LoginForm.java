package com.chandraPrakash.web;

import org.apache.struts.action.ActionForm;

/**
 * Created by ChandraPrakash on 27-04-2017.
 */
public class LoginForm extends ActionForm{
    final String originalUserId="admin";
    final String originalPassword="1234";

    private String userId;
    private String password;

    public String getUserId() { return userId; }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalUserId() {
        return originalUserId;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }

}
