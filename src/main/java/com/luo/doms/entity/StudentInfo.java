package com.luo.doms.entity;

import com.luo.doms.utils.ExcelColumn;
import lombok.Data;

/**
 * @author:luo ~
 * @time:2022.9.16
 * 学生基本信息
 */

@Data
public class StudentInfo {
    @ExcelColumn(value = "学号",col = 1)
    private String stuid;

    @ExcelColumn(value = "姓名",col = 2)
    private String stuname;

    @ExcelColumn(value = "性别",col = 3)
    private String stusex;

    @ExcelColumn(value = "学院",col = 4)
    private String stucollege;

    @ExcelColumn(value = "专业",col = 5)
    private String studept;

    @ExcelColumn(value = "班级",col = 6)
    private String stuclass;

    private String stugrade;

    @ExcelColumn(value = "手机号",col = 7)
    private String stutel;

    @ExcelColumn(value = "QQ",col = 8)
    private String stuqq;

    @ExcelColumn(value = "微信号",col = 9)
    private String stuwx;

    @ExcelColumn(value = "监护人姓名",col = 10)
    private String stututorname;

    @ExcelColumn(value = "监护人联系方式",col = 11)
    private String stututortel;

    @ExcelColumn(value = "家庭住址",col = 12)
    private String stuaddress;
}
