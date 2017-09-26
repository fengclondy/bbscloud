package com.iag.bbscloud.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 上午11:11
 */
@SpringCloudApplication
@EnableZuulProxy
public class GetwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayApplication.class, args);
    }

}
