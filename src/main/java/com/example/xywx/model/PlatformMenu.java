package com.example.xywx.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PlatformMenu implements Serializable {

    private Long menuId;
    private Long platformId;
    private Long parentMenuId;//父类菜单ID
    private int parentMenuCode;//父类菜单编码
    private String parentMenuName;//父类菜单名称
    private int menuCode;//菜单编码
    private String menuName;//菜单名称
    private String menuStatus;//菜单状态
    private String menuType;//菜单类型：1-一级菜单；2-二级菜单
    private int menuSeq;//菜单顺序
    private String leafNode;//是否叶子节点:1-是；0-否
    private Date createTime;
    private Date UpdateTime;
    private String createBy;

}
