package top.lhzcc.springcloudalibaba.service;

import org.springframework.stereotype.Component;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 17:23
 * @Version 1.0
 */
@Component
public class PaymentServiceFallback implements PaymentService {

    @Override
    public String payment(Integer id) {
        return "支付失败，服务器异常。。。";
    }
}
