package top.lhzcc.springcloudalibaba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lhzcc.springcloudalibaba.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 17:21
 * @Version 1.0
 */
@RestController
public class AlibabaConsumerController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    public String payment(@PathVariable("id") Integer id) {
        return paymentService.payment(id);
    }

}
