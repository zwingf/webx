package com.alibaba.webx3.app1.service;

import com.alibaba.webx3.app1.entity.Files;

/**
 * Created by wing on 2017/5/17.
 */
public interface FilesService {
    Files selectByPrimaryKey(Integer filesId);
}
