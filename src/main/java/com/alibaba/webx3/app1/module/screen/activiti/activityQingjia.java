package com.alibaba.webx3.app1.module.screen.activiti;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 韩九日 on 2017/5/16.
 */
public class activityQingjia {
    @Autowired
    private RuntimeService runtimeService;
    // 2.启动流程实例
    public void execute() throws Exception {
        runtimeService.startProcessInstanceByKey("myProcess");
    }
}
