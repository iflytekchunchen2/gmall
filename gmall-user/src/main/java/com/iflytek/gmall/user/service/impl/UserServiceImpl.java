package com.iflytek.gmall.user.service.impl;

import com.iflytek.gmall.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String helloService() {
        return "hello user Service";
    }
}
