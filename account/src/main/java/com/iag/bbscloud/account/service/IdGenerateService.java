package com.iag.bbscloud.account.service;

import com.iag.bbscloud.common.enums.BizTagEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午5:48
 */
@Service
public class IdGenerateService {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public String generateId(){
        String idUrl = "http://RIBBON-SERVER/id?bizTag=" + BizTagEnum.AID.getValue();
        return restTemplate.getForObject(idUrl, String.class);
    }
}
