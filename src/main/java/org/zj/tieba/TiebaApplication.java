package org.zj.tieba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("org.zj.tieba.dao")
public class TiebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiebaApplication.class, args);
    }
}
