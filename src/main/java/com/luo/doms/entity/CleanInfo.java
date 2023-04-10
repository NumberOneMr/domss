package com.luo.doms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author:luo ~
 * 卫生检查信息
 */
@Data
public class CleanInfo {
    private Integer id;
    private String checker;
    private String uid;
    private String brcode;
    private String brarea;
    private String brbid;
    private String brrid;
    private String content;
    private Integer grade;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String time;
}
