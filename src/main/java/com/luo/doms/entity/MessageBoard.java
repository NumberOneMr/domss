package com.luo.doms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author:luo ~
 * @time:2022.9.16
 * 留言板
 */
@Data
public class MessageBoard {
    private Integer id;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String time;
    private String announcer;
    private String brcode;
    private String brarea;
    private String brbid;
    private String brrid;
    private Integer type;
    private String typeValue;


}
