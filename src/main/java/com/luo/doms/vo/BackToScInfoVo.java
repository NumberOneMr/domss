package com.luo.doms.vo;

import com.luo.doms.entity.BackToScInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class BackToScInfoVo extends BackToScInfo {
    private Integer page;
    private Integer limit;

}
