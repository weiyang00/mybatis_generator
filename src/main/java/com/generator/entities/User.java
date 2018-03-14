package com.generator.entities;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String nickname;

    private String password;

    private String mobile;

    private Integer role;

    private Byte status;

    private Date createdTime;

    private Date updatedTime;

    private String backImgUrl;

    private String headImgUrl;

    private String sign;

    private Integer grade;

    public User(Long id, String username, String nickname, String password, String mobile, Integer role, Byte status, Date createdTime, Date updatedTime, String backImgUrl, String headImgUrl, String sign, Integer grade) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.backImgUrl = backImgUrl;
        this.headImgUrl = headImgUrl;
        this.sign = sign;
        this.grade = grade;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getBackImgUrl() {
        return backImgUrl;
    }

    public void setBackImgUrl(String backImgUrl) {
        this.backImgUrl = backImgUrl == null ? null : backImgUrl.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}