package com.example.xywx.service;

import com.example.xywx.mapper.PlatformMapper;
import com.example.xywx.model.Platform;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlatformService {
    @Resource
    private PlatformMapper platformMapper;

    public List<Platform> queryAll(){
        return  platformMapper.queryAll();
    }

    public List<Platform> queryAllMenus(){
        return  platformMapper.queryAllMenus();
    }
}
