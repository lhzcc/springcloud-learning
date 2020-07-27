package top.lhzcc.springcloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import top.lhzcc.springcloud.entities.CommonResult;
import top.lhzcc.springcloud.entities.PayMent;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/7/27 9:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private String PAYMAEN_URL = "http://localhost:8001//api/payment/";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("create")
    public CommonResult create(@RequestBody PayMent payMent) {

        ResponseEntity<CommonResult> entity
                = restTemplate.postForEntity(PAYMAEN_URL + "create", payMent, CommonResult.class);

        return entity.getBody();
    }

    @GetMapping("queryPayment/{id}")
    public CommonResult queryPayment(@PathVariable Long id) {

        ResponseEntity<CommonResult> entity
                = restTemplate.getForEntity(PAYMAEN_URL + "/queryPayment/" + id, CommonResult.class);

        return entity.getBody();
    }

}
