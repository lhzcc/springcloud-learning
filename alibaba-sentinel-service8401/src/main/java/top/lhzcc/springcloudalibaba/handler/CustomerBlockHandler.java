package top.lhzcc.springcloudalibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import top.lhzcc.springcloud.entities.CommonResult;

/**
 * @Author: yaunlh
 * @Date: 2020/8/8 15:05
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(400,"客户自定义 " + exception.getClass());
    }

}
