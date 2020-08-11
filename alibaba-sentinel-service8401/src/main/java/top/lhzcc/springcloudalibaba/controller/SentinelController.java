package top.lhzcc.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: yaunlh
 * @Date: 2020/8/7 15:36
 * @Version 1.0
 */
@RestController
public class SentinelController {

    private String serverUrl = "http://alibaba-provider-payment/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/traceTest/{id}")
    public String traceTest(@PathVariable Integer id) {
        return restTemplate.getForEntity(serverUrl + "api/payment/" + id,String.class).getBody();
    }

    @GetMapping("/testA")
    public String testA() {
        return " ------------------->testA ";
    }

    @GetMapping("/testB")
    public String testB() {
        return " ------------------->testB ";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "testHotKeyHandler")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1, @RequestParam(value = "p1", required = false) String p2) {
        // sentinel只管控制台的规则，不管程序出错
//        int a = 10/0;
        return " ------------------->testHotKey (*￣︶￣) ";
    }

    public String testHotKeyHandler(String p1, String p2, BlockException exception) {
        return "something wrong!!!";
    }
}
