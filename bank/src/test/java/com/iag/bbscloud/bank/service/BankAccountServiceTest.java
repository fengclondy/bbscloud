package com.iag.bbscloud.bank.service;

import com.iag.bbscloud.bank.BankApplicationTest;
import com.iag.bbscloud.common.dto.BankAccountDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/3.
 */
public class BankAccountServiceTest extends BankApplicationTest {
    @Autowired
    private BankAccountService bankAccountService;

    @Test
    public void testCreateAccount() throws BusinessException {
        BigInteger uid = new BigInteger("100110010000000015", 10);

        BankAccountDTO bankAccountDTO = bankAccountService.createAccount(uid);

        System.out.println(bankAccountDTO);
    }


}
