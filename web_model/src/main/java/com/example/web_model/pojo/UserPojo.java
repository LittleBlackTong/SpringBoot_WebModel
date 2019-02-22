package com.example.web_model.pojo;

import java.util.Date;

public class UserPojo {
    private Integer user_id;

    private String user_loginid;

    private String user_name;

    private String user_password;

    private String user_phone;

    private Byte user_sex;

    private String user_email;

    private Date user_createtime;

    private Date user_logintime;

    private Date user_prelogintime;

    private Integer user_logincount;

    private Byte user_available;

    private String user_img;

    private Date user_birthday;

    private Integer user_age;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_loginid() {
        return user_loginid;
    }

    public void setUser_loginid(String user_loginid) {
        this.user_loginid = user_loginid == null ? null : user_loginid.trim();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    public Byte getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(Byte user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public Date getUser_createtime() {
        return user_createtime;
    }

    public void setUser_createtime(Date user_createtime) {
        this.user_createtime = user_createtime;
    }

    public Date getUser_logintime() {
        return user_logintime;
    }

    public void setUser_logintime(Date user_logintime) {
        this.user_logintime = user_logintime;
    }

    public Date getUser_prelogintime() {
        return user_prelogintime;
    }

    public void setUser_prelogintime(Date user_prelogintime) {
        this.user_prelogintime = user_prelogintime;
    }

    public Integer getUser_logincount() {
        return user_logincount;
    }

    public void setUser_logincount(Integer user_logincount) {
        this.user_logincount = user_logincount;
    }

    public Byte getUser_available() {
        return user_available;
    }

    public void setUser_available(Byte user_available) {
        this.user_available = user_available;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img == null ? null : user_img.trim();
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }
}