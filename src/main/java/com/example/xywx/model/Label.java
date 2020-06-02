package com.example.xywx.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 标签信息
 *
 * Created by ZXH on 2020/5/26.
 */
@Data
public class Label implements Serializable {

    private Long labelId;//
    private int labelCode;//标签代码
    private String labelName;//标签名称
    private String labelType;//标签类型：0-默认，1-自定义
    private String labelAuth;//标签对应权限：0-不限，1-普通账号登录，2-信用账号登录
    private String labelStatus;//标签状态
    private int quoteNums;//标签被引用次数
    private Date createTime;//
    private String createBy;//
    private Date updateTime;//
    private String updateBy;//

}
