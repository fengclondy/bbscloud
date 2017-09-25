package com.iag.bbscloud.ribbonserver.service;

import com.iag.bbscloud.common.enums.BizTagEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午5:30
 */
@Service
public class IdGenerateService {

    @Autowired
    RestTemplate restTemplate;
    @Value("${api.idcenter.url}")
    private String idServerUrl;

    public String generateId(BizTagEnum bizTagEnum){
        String idUrl = idServerUrl + "/id?bizTag=" + bizTagEnum.getValue();
        return restTemplate.getForObject(idUrl, String.class);
    }
}
