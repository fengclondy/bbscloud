package com.iag.bbscloud.bank.controller;

import com.iag.bbscloud.bank.service.BankAccountService;
import com.iag.bbscloud.common.dto.BankAccountAddDTO;
import com.iag.bbscloud.common.dto.BankAccountDTO;
import com.iag.bbscloud.common.dto.ResponseDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by beishan on 2017/10/5.
 */
@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/bankaccount")
    public ResponseDTO createAccount(@RequestBody BankAccountAddDTO bankAccountAddDTO) throws BusinessException {
        BankAccountDTO bankAccountDTO = bankAccountService.createAccount(bankAccountAddDTO.getUid());
        return ResponseDTO.buildSuccess("创建银行账户成功", bankAccountDTO);
    }
}
