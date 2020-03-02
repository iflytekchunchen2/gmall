package com.iflytek.gmall.user.controller;

import com.iflytek.gmall.bean.UmsMemberReceiveAddress;
import com.iflytek.gmall.user.service.UserService;
import com.iflytek.gmall.user.service.UserServiceReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceReceiveAddress userServiceReceiveAddress;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return userService.helloService();
    }

    @RequestMapping("/getUserAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUserAddressByMemberId(@RequestParam(value = "memberId", required = false) String member_id){

        List<UmsMemberReceiveAddress> UserAddresss = userServiceReceiveAddress.getUserAddressByMemberId(member_id);
        return UserAddresss;
    }
}
