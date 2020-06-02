package com.example.xywx.service;

import com.example.xywx.mapper.LabelMapper;
import com.example.xywx.model.Label;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by XieWei  on 2020/6/2
 */
@Service
public class LabelService {
    @Resource
    LabelMapper labelMapper;

    public Integer saveLabel() {
        Label label =new Label();
        label.setLabelId(10L);
        label.setLabelCode(0000);
        label.setLabelName("测试标签");
        label.setLabelType("1");
        label.setLabelAuth("0");
        label.setLabelStatus("0");
        label.setQuoteNums(0);
        label.setCreateTime(new Date());
        label.setCreateBy("测试人员");
        label.setUpdateTime(new Date());
        label.setUpdateBy("测试人员2");
        Integer integer = labelMapper.saveLabel(label);
        return integer;
    }
}
