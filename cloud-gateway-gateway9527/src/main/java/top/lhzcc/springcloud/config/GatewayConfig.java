package top.lhzcc.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yaunlh
 * @Date: 2020/8/4 14:55
 * @Version 1.0
 */
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//
//        RouteLocatorBuilder.Builder routes = builder.routes();
//
//        routes.route("path-news-1", r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
//        routes.route("path-news-2", r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
//        routes.route("path-news-3", r->r.path("/mil").uri("http://news.baidu.com/mil")).build();
//        routes.route("path-news-4", r->r.path("/ent").uri("http://news.baidu.com/ent")).build();
//
//        return routes.build();
//    }
//
//}
