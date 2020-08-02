package com.kdgx.gmall.user.controller;

import com.kdgx.gmall.user.bean.UmsMember;
import com.kdgx.gmall.user.bean.UmsMemberReceiveAddress;
import com.kdgx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 尚郑
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 通过 memberId 获取 收货地址
     * @param memberId
     * @return
     */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    /**
     * 查询所有的 userMember
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }



    /**
     * 测试
     * @return
     */
    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}
