package com.kdgx.gmall.service;

import com.kdgx.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author 尚郑
 */
public interface UserService {

    List<com.kdgx.gmall.bean.UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
