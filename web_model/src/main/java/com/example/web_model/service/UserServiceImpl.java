package com.example.web_model.service;


import com.example.web_model.dao.UserPojoMapper;
import com.example.web_model.pojo.UserPojo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserPojoMapper userModelMapper;
    @Override
    public void addUser(UserPojo userModel) {
        userModelMapper.insert(userModel);
    }

    @Override
    public List<UserPojo> getUsers(UserPojo userPojo, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<UserPojo> userPojos=userModelMapper.selectByuserName(userPojo);
        return userPojos;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void getTrans(UserPojo userPojo) {
        userModelMapper.insert(userPojo);
        int a=1/0;
        userModelMapper.deleteByPrimaryKey(4);
    }
}
