package com.example.demo.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//扫描所以配置 同一个包名 如果不同包名不同可以选择通配符
@ComponentScan(basePackages = {"com.example"})
public class TeacherApplication {
        //localhost:8001/swagger-ui.html
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class, args);
    }
}
