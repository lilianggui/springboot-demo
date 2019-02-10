package com.llg.encyclopedias;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.llg.encyclopedias")
@ServletComponentScan
@MapperScan("com.llg.encyclopedias.mapper.dao")
public class EncyclopediasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncyclopediasApplication.class, args);
	}

}

