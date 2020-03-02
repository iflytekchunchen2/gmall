package com.iflytek.gmall.user.service.impl;

import com.iflytek.gmall.bean.UmsMemberReceiveAddress;
import com.iflytek.gmall.user.dao.UserMapperReceiveAddress;
import com.iflytek.gmall.user.service.UserServiceReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
