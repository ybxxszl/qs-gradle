package com.wjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(value = "com.wjy")
@ComponentScan(value = "com.wjy")
public class QSApplication {

	public static void main(String[] args) {

		SpringApplication.run(QSApplication.class, args);

	}

}
