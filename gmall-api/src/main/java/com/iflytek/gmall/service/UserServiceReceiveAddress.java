package com.iflytek.gmall.service;

import com.iflytek.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserServiceReceiveAddress {
    List<UmsMemberReceiveAddress> getUserAddressByMemberId(String userMemberId);
}
