package com.luo.doms.vo;

import com.luo.doms.entity.StudentInfo;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class StudentInfoVo extends StudentInfo {
    private Integer page;
    private Integer limit;
}
