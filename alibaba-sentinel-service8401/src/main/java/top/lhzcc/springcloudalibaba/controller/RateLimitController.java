package top.lhzcc.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lhzcc.springcloud.entities.CommonResult;
import top.lhzcc.springcloud.entities.PayMent;
import top.lhzcc.springcloudalibaba.handler.CustomerBlockHandler;

/**
 * @Author: yaunlh
 * @Date: 2020/8/7 15:36
 * @Version 1.0
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "buResourceHandler")
    public CommonResult buResource() {
        return new CommonResult(200,"按资源名称限流访问成功", new PayMent(1L, "123"));
    }

    public CommonResult buResourceHandler(BlockException exception) {
        return new CommonResult(400,"访问出现了问题 " + exception.getClass());
    }

    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200,"按资源名称限流访问成功", new PayMent(2020L, "12312321"));
    }

}
