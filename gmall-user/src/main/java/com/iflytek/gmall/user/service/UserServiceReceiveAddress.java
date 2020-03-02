package com.iflytek.gmall.user.service;

import com.iflytek.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserServiceReceiveAddress {
    List<UmsMemberReceiveAddress> getUserAddressByMemberId(String userMemberId);
}
