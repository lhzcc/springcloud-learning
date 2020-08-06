package top.lhzcc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.lhzcc.springcloud.entities.CommonResult;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/8/6 15:22
 * @Version 1.0
 */
@RestController
@Slf4j
public class AlibabaConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.provider-payment-service}")
    private String serviceUrl;

    @GetMapping("/consumer/payment/{id}")
    public String payment(@PathVariable Integer id) {
        return restTemplate.getForEntity(serviceUrl + "/api/payment/" + id, String.class).getBody();
    }


}
