package top.lhzcc.spinrgcloudalbaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 17:07
 * @Version 1.0
 */
@RestController
public class AlibabaPaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/api/payment/{id}")
    public String payment(@PathVariable Integer id) {
        return "支付订单流水号： " + id + " 服务端口：" + serverPort;
    }

}
