package com.luo.doms.entity;

import lombok.Data;

@Data
public class Menu {
    private Integer id;
    private Integer pid;
    private String title;
    private String href;
    private String target;
    private String icon;
    private String utype;

}
