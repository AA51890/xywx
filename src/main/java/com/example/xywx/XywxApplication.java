package com.example.xywx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xywx.mapper")
public class XywxApplication {

	public static void main(String[] args) {
		SpringApplication.run(XywxApplication.class, args);
	}

}
