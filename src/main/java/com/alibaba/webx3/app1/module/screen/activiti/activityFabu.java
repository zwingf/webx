package com.alibaba.webx3.app1.module.screen.activiti;

import com.alibaba.citrus.turbine.Context;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 韩九日 on 2017/5/16.
 */
public class activityFabu {
    @Autowired
    protected RepositoryService repositoryService;
    // 1.发布流程规则
    public void execute(Context context) throws Exception {
        DeploymentBuilder builder = repositoryService.createDeployment();
        builder.addClasspathResource("bpmn/hanjiuri.bpmn");
        Deployment deploy = builder.deploy();
        context.put("id",deploy.getId());
    }
    /*// 2.启动流程实例
    public void startFlow() throws Exception {
        runtimeService.startProcessInstanceByKey("myProcess");
    }

    // 3.查看任务
    public void quertTask() {
        String userId = "张三";
        List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId)
                .list();
        for (Task task : tasks) {
            System.out.println("Id:" + task.getId() + ",name:" + task.getName()
                    + ",assignee:" + task.getAssignee() + ",createTime:"
                    + task.getCreateTime());
        }
    }

    //4.办理任务
    public void completeTask() throws Exception{
        String taskId="204";
        taskService.complete(taskId);
    }*/
}
