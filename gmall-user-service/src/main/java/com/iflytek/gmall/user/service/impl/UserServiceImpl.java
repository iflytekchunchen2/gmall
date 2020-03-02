package com.iflytek.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iflytek.gmall.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String helloService() {
        return "hello user Service";
    }
}
