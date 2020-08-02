package com.kdgx.gmall.user.service;

import com.kdgx.gmall.user.bean.UmsMember;
import com.kdgx.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author 尚郑
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
