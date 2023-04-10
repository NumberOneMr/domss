package com.luo.doms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.luo.doms.utils.ExcelColumn;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class StayInfo {
    private Integer id;

    @ExcelColumn(value = "学号", col = 1)
    private String stuid;

    @ExcelColumn(value = "姓名", col = 2)
    private String stuname;

    @ExcelColumn(value = "学院", col = 3)
    private String stucollege;

    @ExcelColumn(value = "专业", col = 4)
    private String studept;

    @ExcelColumn(value = "班级", col = 5)
    private String stuclass;

    private String stugrade;

    private String brcode;

    @ExcelColumn(value = "宿舍区", col = 6)
    private String brarea;

    @ExcelColumn(value = "楼栋", col = 7)
    private String brbid;

    @ExcelColumn(value = "寝室", col = 8)
    private String brrid;

    @ExcelColumn(value = "留校原因", col = 9)
    private String reason;

    @ExcelColumn(value = "留校截止时间", col = 10)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String time;

    private String opinion;

    @ExcelColumn(value = "手机号", col = 11)
    private String stutel;

    @ExcelColumn(value = "家长姓名", col = 12)
    private String stututorname;

    @ExcelColumn(value = "家长联系方式", col = 13)
    private String stututortel;

    private String approvetext;

    private Integer approvetype;

    private String approveValue;

}
