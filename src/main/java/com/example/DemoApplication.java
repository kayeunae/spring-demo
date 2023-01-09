package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//@Controller + @ResponseBody : 컨트롤러이면서 동시에 응답을 하는 역할의 어노테이션
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String HelloWorld() {
		return "Hello World!";
	}
	
}
