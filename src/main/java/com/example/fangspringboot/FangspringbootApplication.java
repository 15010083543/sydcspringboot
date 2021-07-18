package com.example.fangspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 扫描这个包下
@SpringBootApplication(scanBasePackages = {"com.example.fangspringboot"})
// 扫描dao下的接口
@MapperScan("com.example.fangspringboot.dal")
// 切面
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class FangspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FangspringbootApplication.class, args);
	}

}

