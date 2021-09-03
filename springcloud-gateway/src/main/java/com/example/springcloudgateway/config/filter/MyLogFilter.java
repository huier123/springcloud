package com.example.springcloudgateway.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Order(0)
@Slf4j
@Configuration
public class MyLogFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("************come in MyLogGatewatFilter "+ new Date());
        //判断是否携带uname的key
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        //非法用户请离开
        if(uname==null){
            log.info("************用户名为null，非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //合法用户进行下一个过滤链进行过滤验证
        return chain.filter(exchange);

    }
}
