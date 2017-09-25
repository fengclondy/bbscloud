package com.iag.bbscloud.ribbonserver.service;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午6:29
 */
@Service
public class AccountService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${api.account.url}")
    private String accountServerUrl;

    public AccountDTO addAccount(AccountAddDTO accountAddDTO){
        String url = accountServerUrl + "/account";
        return restTemplate.postForObject(url, accountAddDTO, AccountDTO.class);
    }
}
