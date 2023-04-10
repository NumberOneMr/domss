package com.luo.doms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.luo.doms.utils.ExcelColumn;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author:luo ~
 * @time:202.9.16
 * 报修信息
 */
@Data
public class RepairInfo {
    private Integer id;

    private String stuid;

    @ExcelColumn(value = "学生姓名",col = 2)
    private String stuname;

    @ExcelColumn(value = "联系方式",col = 3)
    private String stutel;

    private String brcode;

    @ExcelColumn(value = "宿舍区",col = 4)
    private String brarea;

    @ExcelColumn(value = "楼栋",col = 5)
    private String brbid;

    @ExcelColumn(value = "寝室",col = 6)
    private String brrid;

    @ExcelColumn(value = "报修类型",col = 7)
    private String type;

    @ExcelColumn(value = "描述",col = 8)
    private String content;

    @ExcelColumn(value = "维修状态",col = 9)
    private String status;

    @ExcelColumn(value = "提交时间",col = 1)
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String subtime;

}
