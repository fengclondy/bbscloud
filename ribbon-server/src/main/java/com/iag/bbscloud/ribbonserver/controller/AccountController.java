package com.iag.bbscloud.ribbonserver.controller;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.ribbonserver.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午6:38
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("account")
    public AccountDTO addAccount(@RequestParam AccountAddDTO accountAddDTO){
        return accountService.addAccount(accountAddDTO);
    }
}
