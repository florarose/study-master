package com.study.iuser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.iuser.mapper.UserMapper;
import com.study.iuser.model.User;
import com.study.iuser.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
