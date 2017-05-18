package com.alibaba.webx3.app1.service.impl;

import com.alibaba.webx3.app1.dao.FilesMapper;
import com.alibaba.webx3.app1.entity.Files;
import com.alibaba.webx3.app1.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wing on 2017/5/17.
 */
@Service
public class FilesServiceImpl implements FilesService{
    @Autowired
    private FilesMapper filesMapper;
    @Override
    public Files selectByPrimaryKey(Integer filesId) {
        return filesMapper.selectByPrimaryKey(filesId);
    }
}
