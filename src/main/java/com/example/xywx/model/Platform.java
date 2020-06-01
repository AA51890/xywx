package com.example.xywx.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Platform implements Serializable {

    private Long platformId;
    private int platformCode;//平台编码
    private String platformName;//平台名称
    private String platformStatus;//平台状态
    private String platformType;//平台类别
    private String platformBelong;//平台所属
    private Date createTime;
    private Date updateTime;
    private String createBy;
    private List<PlatformMenu> platformMenuList;

    private String test1;       //测试1·
    private String test2;       //我偏要改
    private String test3;       //测试3·
    private String test4;       //我才是真正的测试4

    @Override
    public String toString() {
        return "Platform{" +
                "test1='" + test1 + '\'' +
                ", test3='" + test3 + '\'' +
                '}';
    }
}
