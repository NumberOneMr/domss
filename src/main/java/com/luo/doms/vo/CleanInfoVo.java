package com.luo.doms.vo;

import com.luo.doms.entity.CleanInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class CleanInfoVo extends CleanInfo {
    private Integer page;
    private Integer limit;
    private String stucollege;
    private String studept;
    private String stuclass;
    private String stuid;

}
