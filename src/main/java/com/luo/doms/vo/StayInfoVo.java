package com.luo.doms.vo;

import com.luo.doms.entity.StayInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class StayInfoVo extends StayInfo {
    private Integer page;
    private Integer limit;
}
