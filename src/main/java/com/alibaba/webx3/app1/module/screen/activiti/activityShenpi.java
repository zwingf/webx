package com.alibaba.webx3.app1.module.screen.activiti;

import com.alibaba.citrus.turbine.Context;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 韩九日 on 2017/5/16.
 */
public class activityShenpi {
    @Autowired
    private TaskService taskService;
    // 3.待审批
    public void execute(Context context) {
        /*String userId = "张三";*/
        List<Task> tasks = taskService.createTaskQuery()/*.taskAssignee(userId)*/
                .list();
/*        for (Task task : tasks) {
            //任务id
            context.put("id",task.getId());
            //任务名称
            context.put("name",task.getName());
            //任务申请人
            context.put("assignee",task.getAssignee());
            //任务申请时间
            context.put("createTime",task.getCreateTime());
        }*/
        context.put("list",tasks);
    }
}
