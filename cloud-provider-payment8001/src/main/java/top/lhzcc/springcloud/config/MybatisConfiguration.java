package top.lhzcc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yaunlh
 * @Date: 2020/7/27 14:03
 * @Version 1.0
 */
@Configuration
@MapperScan({"top.lhzcc.springcloud.dao"})
public class MybatisConfiguration {


}
