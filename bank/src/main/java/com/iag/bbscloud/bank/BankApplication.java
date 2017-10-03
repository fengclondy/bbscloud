package com.iag.bbscloud.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/2 下午1:40
 */
@SpringCloudApplication
public class BankApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }
}
