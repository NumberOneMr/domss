package com.luo.doms.vo;

import com.luo.doms.entity.MessageBoard;
import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)
@Data
public class MessageBoardVo extends MessageBoard {
    private Integer page;
    private Integer limit;
}
