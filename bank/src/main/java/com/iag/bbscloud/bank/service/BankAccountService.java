package com.iag.bbscloud.bank.service;

import com.iag.bbscloud.common.dto.BankAccountDTO;
import com.iag.bbscloud.common.exception.BusinessException;

import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/3.
 */
public interface BankAccountService {
    BankAccountDTO createAccount(BigInteger uid) throws BusinessException;

    BankAccountDTO queryAccountByBankAccountId(BigInteger baid) throws BusinessException;

    BankAccountDTO queryAccountByUid(BigInteger uid) throws BusinessException;
}
