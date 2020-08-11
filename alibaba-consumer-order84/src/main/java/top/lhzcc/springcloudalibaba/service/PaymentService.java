package top.lhzcc.springcloudalibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 17:22
 * @Version 1.0
 */
@FeignClient(value = "alibaba-provider-payment" , fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping("/api/payment/{id}")
    String payment(@PathVariable("id") Integer id);

}
