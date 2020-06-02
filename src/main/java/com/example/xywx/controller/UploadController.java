package com.example.xywx.controller;

import com.example.xywx.util.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by XieWei  on 2020/6/2
 */
@Controller
public class UploadController {
    @Autowired
    Environment environment;

    public String getPort(){
        return environment.getProperty("local.server.port");
    }

    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @GetMapping("/2")
    public String index2() {
        return "uploadContext";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile multipartFile) {


        String originalFilename = multipartFile.getOriginalFilename();
        String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));        //获取文件后缀
        System.out.println("[\"originalFilename\"] = " + originalFilename);
        System.out.println("[\"suffix\"] = " + suffix);
        return originalFilename;
    }

    @RequestMapping("/uploadContext")
    @ResponseBody
    public String upload(String context) throws FileNotFoundException {
        //文件上传的地址
        String path = ResourceUtils.getURL("classpath:").getPath() + "static/upload/";
        String realPath = path.replace('/', '\\').substring(1, path.length());
        //文件名称
        String contextName = IDUtil.getUUID() + ".html";
        //存储文件
        FileOutputStream output = null;
        String url = realPath + contextName + ".html";

        try {
            output = new FileOutputStream(url, true);         //true表示在文件末尾追加
            output.write(context.getBytes());
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回文件url
        InetAddress localHost = null;

        try {
            localHost = Inet4Address.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("[\"e\"] = " + e);
        }

        String ip = localHost.getHostAddress();  // 返回格式为：xxx.xxx.xxx
        String port = getPort();

        String result = "http://"+ip+":"+port+"/upload/" + contextName + ".html";

        return result;
    }

}
