package com.iag.bbscloud.account.service;

import com.iag.bbscloud.account.AccountApplicationTest;
import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by beishan on 2017/10/3.
 */
public class AccountServiceTest extends AccountApplicationTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testAddAccount() throws BusinessException {
        AccountAddDTO accountAddDTO = new AccountAddDTO("testaccount", "123456");
        AccountDTO accountDTO = accountService.addAccount(accountAddDTO);
        System.out.println(accountDTO);
    }
}
