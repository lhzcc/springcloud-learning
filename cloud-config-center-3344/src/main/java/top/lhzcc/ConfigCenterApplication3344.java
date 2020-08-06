package top.lhzcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: yaunlh
 * @Date: 2020/8/5 9:33
 * @Version 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }

}
