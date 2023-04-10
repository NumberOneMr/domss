package com.luo.doms.vo;

import com.luo.doms.entity.AllocationInfo;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString(callSuper = true)
@Data
public class AllocationInfoVo extends AllocationInfo {
    private Integer page;
    private Integer limit;
}
