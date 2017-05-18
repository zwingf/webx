package com.alibaba.webx3.app1.entity;


import java.util.Date;

public class Files {
    private Integer filesId;

    private Integer filesClassId;

    private String filesClassName;

    private Date filesTime;

    private Date filesLasttime;

    private Integer filesProviderid;

    private String filesProvider;

    private Integer userId;

    private String userName;

    private String filesName;

    public String getFilesName() {
        return filesName;
    }

    public void setFilesName(String filesName) {
        this.filesName = filesName;
    }

    public Integer getFilesId() {
        return filesId;
    }

    public void setFilesId(Integer filesId) {
        this.filesId = filesId;
    }

    public Integer getFilesClassId() {
        return filesClassId;
    }

    public void setFilesClassId(Integer filesClassId) {
        this.filesClassId = filesClassId;
    }

    public String getFilesClassName() {
        return filesClassName;
    }

    public void setFilesClassName(String filesClassName) {
        this.filesClassName = filesClassName == null ? null : filesClassName.trim();
    }

    public Date getFilesTime() {
        return filesTime;
    }

    public void setFilesTime(Date filesTime) {
        this.filesTime = filesTime;
    }

    public Date getFilesLasttime() {
        return filesLasttime;
    }

    public void setFilesLasttime(Date filesLasttime) {
        this.filesLasttime = filesLasttime;
    }

    public Integer getFilesProviderid() {
        return filesProviderid;
    }

    public void setFilesProviderid(Integer filesProviderid) {
        this.filesProviderid = filesProviderid;
    }

    public String getFilesProvider() {
        return filesProvider;
    }

    public void setFilesProvider(String filesProvider) {
        this.filesProvider = filesProvider == null ? null : filesProvider.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}