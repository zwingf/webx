/*
 * Copyright (c) 2002-2012 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.webx3.app1.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx3.app1.entity.User;
import com.alibaba.webx3.app1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class LoginAction {
    @Autowired
    private LoginService userService;
    public void doLogin(@FormGroup("login") User user, Navigator nav) {
        User user1 = userService.login(user);
        if(user1.getUser_leixing().equals("领导")||user1.getUser_leixing().equals("员工")){
            nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("name",user.getUser_name()).withParameter("leixing",user1.getUser_leixing());
            return;
        }
        nav.redirectTo("app1Link").withTarget("form/welcome").withParameter("name","用户名不存在").withParameter("leixing","无");
    }
}
