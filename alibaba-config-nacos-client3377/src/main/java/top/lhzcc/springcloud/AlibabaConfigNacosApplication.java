package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yaunlh
 * @Date: 2020/8/7 9:31
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaConfigNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConfigNacosApplication.class,args);
    }

}
