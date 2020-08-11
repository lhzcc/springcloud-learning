package top.lhzcc.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 17:20
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class AlibabaConsumerApplication84 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumerApplication84.class, args);
    }

}
