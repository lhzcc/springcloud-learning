package top.lhzcc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yaunlh
 * @Date: 2020/8/7 9:55
 * @Version 1.0
 */
@RestController
@RefreshScope //自定刷新配置注解
public class AlibabaConfigNacosConroller {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/info")
    public String configInfo() {
        return info;
    }

}
