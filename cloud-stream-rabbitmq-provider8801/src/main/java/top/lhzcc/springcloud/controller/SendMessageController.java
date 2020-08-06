package top.lhzcc.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lhzcc.springcloud.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/8/6 9:37
 * @Version 1.0
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/send")
    public void send() {
        messageProvider.send();
    }

}
