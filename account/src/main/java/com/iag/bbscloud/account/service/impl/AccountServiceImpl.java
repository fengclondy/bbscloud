package com.iag.bbscloud.account.service.impl;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.account.model.Account;
import com.iag.bbscloud.account.model.repository.AccountRepository;
import com.iag.bbscloud.account.service.AccountService;
import com.iag.bbscloud.account.service.IdGenerateService;
import com.iag.bbscloud.common.date.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:27
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private IdGenerateService idGenerateService;

    @Override
    public AccountDTO addAccount(AccountAddDTO accountAddDTO) {
        // 1.check the account is exist?
        Account existAccount = accountRepository.queryAccountByName(accountAddDTO.getName());
        // TODO: 2017/9/25 这里需要判断是否账号已经存在，如果是需要抛出异常
        // 2.generate uid
        String uid = idGenerateService.generateId();

        // 3.add account
        Date now = DateUtils.getNow();
        Account newAccount = new Account(new BigInteger(uid, 10),
                accountAddDTO.getName(),
                accountAddDTO.getPassword(),
                now, now);

        newAccount = accountRepository.save(newAccount);

        return AccountDTO.build(newAccount.getUid().toString(), newAccount.getName());
    }

    @Override
    public void deleteAccount(String uid) {

    }
}
