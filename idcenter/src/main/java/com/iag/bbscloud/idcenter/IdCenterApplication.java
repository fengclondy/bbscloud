package com.iag.bbscloud.idcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:07
 */
@SpringBootApplication
@EnableEurekaClient
public class IdCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(IdCenterApplication.class, args);
    }
}
