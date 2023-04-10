package com.luo.doms.entity;

import com.luo.doms.utils.ExcelColumn;
import lombok.Data;

/**
 * @author:luo ~
 * 宿舍分配/预分配信息
 */
@Data
public class AllocationInfo {
    // 学生相关信息
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

    // 宿舍相关信息
    @ExcelColumn(value = "宿舍编号", col = 6)
    private String brcode;

    @ExcelColumn(value = "宿舍区", col = 7)
    private String brarea;

    @ExcelColumn(value = "楼栋", col = 8)
    private String brbid;

    @ExcelColumn(value = "寝室", col = 9)
    private String brrid;

    @ExcelColumn(value = "床位号", col = 10)
    private Integer bed;
    // 预分配的状态（1已选床位/0未选）
    private Integer status;

    private String stugrade;

    private String stutel;

}
