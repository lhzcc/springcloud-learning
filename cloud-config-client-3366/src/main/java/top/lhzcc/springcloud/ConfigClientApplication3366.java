package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yaunlh
 * @Date: 2020/8/5 10:23
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }

}
