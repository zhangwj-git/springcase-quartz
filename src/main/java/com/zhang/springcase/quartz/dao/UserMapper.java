package com.zhang.springcase.quartz.dao;

import com.zhang.springcase.quartz.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserEntity> findAllUsers();
}
