package com.alibaba.webx3.app1.service.impl;

import com.alibaba.webx3.app1.dao.LoginMapper;
import com.alibaba.webx3.app1.entity.User;
import com.alibaba.webx3.app1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 韩九日 on 2017/5/15.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public User login(User user) {
        return loginMapper.login(user);
    }
}
