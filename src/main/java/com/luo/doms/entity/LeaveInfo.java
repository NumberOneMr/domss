package com.luo.doms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.luo.doms.utils.ExcelColumn;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class LeaveInfo {
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

    @ExcelColumn(value = "手机号", col = 6)
    private String stutel;

    private Integer got;

    @ExcelColumn(value = "去向", col = 7)
    private String gotValue;

    @ExcelColumn(value = "目的地", col = 8)
    private String dest;

    @ExcelColumn(value = "回校时间", col = 9)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String time;

    @ExcelColumn(value = "紧急联系人", col = 10)
    private String ectel;

}
