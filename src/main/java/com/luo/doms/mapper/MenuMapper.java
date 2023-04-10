package com.luo.doms.mapper;

import com.luo.doms.entity.Menu;

import java.util.List;

public interface MenuMapper {
    /**
     * 查询所有菜单
     * @return
     */
    public List<Menu> findMenuList(Integer utype);
}
