package com.anttu.leak;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述
 *
 * @ClassName：Z_testCodeApplication
 * @Description：
 * @author：Anttu
 * @Date：23/8/2021 13:46
 */
@MapperScan("com.anttu.leak.mapper")
@SpringBootApplication(scanBasePackages = "com.anttu.leak.*")
public class JavaWebLeakTrainApplication {
    public static void main (String[] args) {
        SpringApplication.run(JavaWebLeakTrainApplication.class, args);
    }
}
