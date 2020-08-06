package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yaunlh
 * @Date: 2020/8/6 15:17
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaConsumerOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumerOrderApplication80.class, args);
    }

}
