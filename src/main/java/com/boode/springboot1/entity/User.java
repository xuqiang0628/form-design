package com.boode.springboot1.entity;

public class User {
    private Integer userNo;
    private String username;


    public User() {
    }

    public User(Integer userNo, String username) {
        this.userNo = userNo;
        this.username = username;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNo=" + userNo +
                ", username='" + username + '\'' +
                '}';
    }
}
