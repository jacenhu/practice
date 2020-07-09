package com.jacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注主程序，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args){
        // Spring应用启动
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
