package com.luo.doms.entity;

import com.luo.doms.utils.ExcelColumn;
import lombok.Data;

/**
 * @author:luo ~
 * 返校信息
 */
@Data
public class BackToScInfo {
    private Integer id;
    @ExcelColumn(value = "学号", col = 1)
    private String stuid;

    @ExcelColumn(value = "是否延迟返校", col = 7)
    private String delay;

    @ExcelColumn(value = "延迟原因", col = 8)
    private String reason;

    @ExcelColumn(value = "返校时间", col = 9)
    private String time;

    @ExcelColumn(value = "返校方式", col = 10)
    private String way;

    @ExcelColumn(value = "车次信息", col = 11)
    private String trainnum;

    @ExcelColumn(value = "姓名", col = 2)
    private String stuname;

    @ExcelColumn(value = "学院", col = 3)
    private String stucollege;

    @ExcelColumn(value = "专业", col = 4)
    private String studept;

    @ExcelColumn(value = "班级", col = 5)
    private String stuclass;

    private String stugrade;

    @ExcelColumn(value = "联系方式", col = 6)
    private String stutel;

}
