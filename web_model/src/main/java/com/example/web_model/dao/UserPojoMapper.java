package com.example.web_model.dao;

import com.example.web_model.pojo.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPojoMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    UserPojo selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);

    List<UserPojo> selectByuserName(UserPojo userPojo);
}