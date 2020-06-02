package com.example.xywx.util;

import java.util.UUID;

/**
 * Created by XieWei  on 2020/6/2
 */
public class IDUtil {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.println(IDUtil.getUUID());
        }
    }
}
