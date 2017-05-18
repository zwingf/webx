package com.alibaba.webx3.app1.dao;

import com.alibaba.webx3.app1.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by 韩九日 on 2017/5/15.
 */
@Repository
public interface LoginMapper {
    User login(User user);
}
