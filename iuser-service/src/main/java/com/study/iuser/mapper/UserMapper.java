package com.study.iuser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.iuser.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
