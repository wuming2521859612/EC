package com.Ecweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.controller","com.service"})
@MapperScan(basePackages={"com.dao"})
public class EcwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcwebApplication.class, args);
	}
}
