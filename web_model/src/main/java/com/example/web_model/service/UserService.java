package com.example.web_model.service;



import com.example.web_model.pojo.UserPojo;

import java.util.List;

public interface UserService {
    public void addUser(UserPojo userModel);

    public List<UserPojo> getUsers(UserPojo userPojo, Integer page, Integer pageSize);

    public void getTrans(UserPojo userPojo);
}