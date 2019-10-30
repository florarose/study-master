package com.study.iuser.api;

import com.netflix.discovery.DiscoveryClient;
import com.study.iuser.model.User;
import com.study.iuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserApi {

    @Autowired
    private UserService userService;


    @Autowired
    private DiscoveryClient discoveryClient;
    public void listUser(){
        List<User> userList = userService.list();
        System.out.println("user的长度为：" + userList.size());
        this.discoveryClient.getInstancesById("");
    }
}
