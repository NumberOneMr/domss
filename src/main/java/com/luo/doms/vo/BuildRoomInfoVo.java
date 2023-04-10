package com.luo.doms.vo;

import com.luo.doms.entity.BuildRoomInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class BuildRoomInfoVo extends BuildRoomInfo {
    private Integer page;
    private Integer limit;

}
