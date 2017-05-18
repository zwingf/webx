package com.alibaba.webx3.app1.dao;

import com.alibaba.webx3.app1.entity.Files;

public interface FilesMapper {
    Files selectByPrimaryKey(Integer filesId);

}