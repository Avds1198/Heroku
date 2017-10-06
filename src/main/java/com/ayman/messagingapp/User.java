package com.ayman.messagingapp;

import org.hibernate.validator.constraints.Email;

public class User {
    protected String userName;
    protected String fullName;
    protected Email email;
    protected String password;
            
    public User(String u,String f,Email e,String p) {
        this.userName = u;
        this.fullName = f;
        this.email = e;
        this.password = p;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
