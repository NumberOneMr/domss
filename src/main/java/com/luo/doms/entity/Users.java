package com.luo.doms.entity;

import lombok.Data;

@Data
public class Users {
    private String uid;
    private String uname;
    private String upwd;
    private Integer utype;
    // 教师负责的专业
    private String dept;
    // 教师负责的年级
    private String grade;
    // 宿管员负责的宿舍区
    private String brarea;
    // 宿管员负责的宿舍楼
    private String brbid;
    private String utel;

}
