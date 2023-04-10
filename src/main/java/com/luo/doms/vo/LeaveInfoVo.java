package com.luo.doms.vo;

import com.luo.doms.entity.LeaveInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class LeaveInfoVo extends LeaveInfo {
    private Integer page;
    private Integer limit;

}
