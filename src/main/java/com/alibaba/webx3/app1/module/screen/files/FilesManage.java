package com.alibaba.webx3.app1.module.screen.files;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.webx3.app1.entity.Files;
import com.alibaba.webx3.app1.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by wing on 2017/5/17.
 */
public class FilesManage {

    @Autowired
    private FilesService filesService;

    public void execute(Context context) {
        Files files = filesService.selectByPrimaryKey(1);
        context.put("files",files );
        context.put("test","这是测试数据");
        System.out.println(files);

    }
}
