package top.lhzcc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lhzcc.springcloud.entities.CommonResult;
import top.lhzcc.springcloud.entities.PayMent;
import top.lhzcc.springcloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/7/30 10:38
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<PayMent> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

}
