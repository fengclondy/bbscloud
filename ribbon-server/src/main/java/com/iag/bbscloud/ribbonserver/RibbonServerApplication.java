package com.iag.bbscloud.ribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午5:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonServerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
