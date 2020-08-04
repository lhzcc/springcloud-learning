package top.lhzcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: yaunlh
 * @Date: 2020/8/4 9:45
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboardApplication9001.class, args);
    }

}
