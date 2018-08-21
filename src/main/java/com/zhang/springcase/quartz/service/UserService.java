package com.zhang.springcase.quartz.service;

import com.zhang.springcase.quartz.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {


    List<UserEntity> findAll();

    List<UserEntity> listUser();
}
