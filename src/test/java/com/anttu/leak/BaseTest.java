package com.anttu.leak;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述
 *
 * @ClassName：BaseTest
 * @Description：
 * @author：Anttu
 * @Date：23/8/2021 14:16
 */
@Configuration
@ComponentScan("com.anttu.leak.*")
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {

}
