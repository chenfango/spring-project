package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动方式：
 *  1. run application
 *  2. mvn spring-boot:run
 *  3. mvn install && cd target && java -jar girl-0.0.1-SNAPSHOT.jar
 *
 *
 */
@SpringBootApplication
public class GirlApplication {

    public static void main(String[] args) {

        SpringApplication.run(GirlApplication.class, args);
    }

}
