package top.lhzcc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.lhzcc.springcloud.entities.CommonResult;
import top.lhzcc.springcloud.entities.PayMent;

/**
 * @Author: yaunlh
 * @Date: 2020/7/30 10:32
 * @Version 1.0
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/api/payment/queryPayment/{id}")
    CommonResult<PayMent> getPaymentById(@PathVariable("id") Long id);

}
