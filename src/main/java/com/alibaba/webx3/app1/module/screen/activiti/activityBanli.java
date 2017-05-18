package com.alibaba.webx3.app1.module.screen.activiti;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 韩九日 on 2017/5/16.
 */
public class activityBanli {
    @Autowired
    private TaskService taskService;
    //4.办理任务
    public void execute(@Param("id")String taskId, Context context) throws Exception{
        taskService.complete(taskId);
        context.put("id",taskId);

    }
}
