package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yaunlh
 * @Date: 2020/7/30 11:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentPorviderHystrixApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentPorviderHystrixApplication8001.class, args);
    }

}
