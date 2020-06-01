package com.example.xywx.controller;

import com.example.xywx.model.Platform;
import com.example.xywx.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    @RequestMapping("/queryAll")
    public List<Platform> queryAll(){
        return  platformService.queryAll();
    }

    @RequestMapping("/queryAllMenus")
    public List<Platform> queryAllMenus(){
        return  platformService.queryAllMenus();
    }
}
