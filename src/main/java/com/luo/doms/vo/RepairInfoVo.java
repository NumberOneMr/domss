package com.luo.doms.vo;

import com.luo.doms.entity.RepairInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class RepairInfoVo extends RepairInfo {
    private Integer page;
    private Integer limit;

}
