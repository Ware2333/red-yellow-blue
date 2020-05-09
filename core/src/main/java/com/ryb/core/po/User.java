package com.ryb.core.po;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String userName;
    private String userNickname;
    private String userHeadPortrait;
    private Integer userSex;
    private String userAutograph;
    private String userOpenid;
    private Long userMobile;
    private String userMail;
    private String userPass;
    private Date lastLoginTime;
    private Date createTime;
    private Long createUser;
    private Date updateTime;
    private Long updateUser;
}
