package com.iag.bbscloud.account.controller;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.account.service.AccountService;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import com.iag.bbscloud.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Objects;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午6:21
 */
@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("account")
    public AccountDTO addAccount(@RequestBody AccountAddDTO accountAddDTO) throws BusinessException{
        return accountService.addAccount(accountAddDTO);
    }

    @GetMapping("/account/{uid}")
    public AccountDTO queryAccountById(@PathVariable BigInteger uid) throws ParameterException{
        if(Objects.nonNull(uid) && StringUtils.isNotBlank(uid.toString())){
            return accountService.queryAccountById(uid);
        }else {
            log.error("[para error] uid");
            throw new ParameterException("[para error] uid", ExceptionEnum.PARAMETER_ERROR);
        }
    }
}
