package com.mikey.javaDemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@SpringBootTest
@Slf4j
class JavaDemoApplicationTests {
    @Autowired
    private Environment environment;
    @Value("123")
    String name;
    @Test
    void contextLoads() {
        String property = environment.getProperty("123");
        log.info("123:{}",property);
        log.info("name:{}",name);
        
    }

}
