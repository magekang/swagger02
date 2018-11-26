package com.mage.swagger02;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2Doc
public class Swagger02Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger02Application.class, args);
	}
}
