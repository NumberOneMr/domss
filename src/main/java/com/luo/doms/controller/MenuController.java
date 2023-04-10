package com.luo.doms.controller;

import com.luo.doms.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping
public class MenuController {

    @Resource
    private MenuService menuService;


}
