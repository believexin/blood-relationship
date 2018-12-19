package com.believexin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.believexin.repository")
public class BloodRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodRelationshipApplication.class, args);
	}
}
