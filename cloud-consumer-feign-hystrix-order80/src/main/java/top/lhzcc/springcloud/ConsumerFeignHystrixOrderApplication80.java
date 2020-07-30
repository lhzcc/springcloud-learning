package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: yaunlh
 * @Date: 2020/7/30 14:28
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerFeignHystrixOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixOrderApplication80.class, args);
    }
    
}
