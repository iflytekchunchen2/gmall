package com.iflytek.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iflytek.gmall.bean.UmsMemberReceiveAddress;
import com.iflytek.gmall.service.UserServiceReceiveAddress;
import com.iflytek.gmall.user.dao.UserMapperReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserReceiveAddressServiceImpl implements UserServiceReceiveAddress {

    @Autowired
    private UserMapperReceiveAddress userMapperReceiveAddress;

    @Override
    public List<UmsMemberReceiveAddress> getUserAddressByMemberId(String userMemberId) {

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", userMemberId);

        return userMapperReceiveAddress.selectByExample(example);
    }
}
