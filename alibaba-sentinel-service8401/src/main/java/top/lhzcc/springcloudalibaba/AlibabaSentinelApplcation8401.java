package top.lhzcc.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yaunlh
 * @Date: 2020/8/7 15:35
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AlibabaSentinelApplcation8401 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaSentinelApplcation8401.class, args);
    }

}
