package com.example.xywx.controller;

import com.example.xywx.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XieWei  on 2020/6/2
 */
@RestController
public class LabelController {
    @Autowired
    private LabelService labelService;

    @RequestMapping("/saveLabel")
    public String saveLabel(){
        Integer integer = labelService.saveLabel();
        return "成功值："+integer;
    }

}
