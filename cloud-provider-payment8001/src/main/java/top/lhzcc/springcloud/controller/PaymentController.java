package top.lhzcc.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import top.lhzcc.springcloud.entities.CommonResult;
import top.lhzcc.springcloud.entities.PayMent;
import top.lhzcc.springcloud.service.PaymentService;

/**
 * @Author: yaunlh
 * @Date: 2020/7/27 9:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("create")
    public CommonResult<PayMent> create(@RequestBody PayMent payMent) {

        Long aLong = paymentService.create(payMent);

        return new CommonResult(HttpStatus.OK.value(),"添加成功",aLong);
    }

    @GetMapping("queryPayment/{id}")
    public CommonResult<PayMent> queryPayment(@PathVariable Long id) {

        PayMent payMent = paymentService.queryPayment(id);

        return new CommonResult(HttpStatus.OK.value(),"查询成功",payMent);
    }

}
