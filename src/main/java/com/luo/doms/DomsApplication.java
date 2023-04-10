package com.luo.doms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luo.doms.mapper")
@SpringBootApplication
public class DomsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomsApplication.class, args);
    }

}
