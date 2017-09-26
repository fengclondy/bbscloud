package com.iag.bbscloud.account.service.impl;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.account.model.Account;
import com.iag.bbscloud.account.model.repository.AccountRepository;
import com.iag.bbscloud.account.service.AccountService;
import com.iag.bbscloud.account.service.IdGenerateService;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.EntityOperateException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:27
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private IdGenerateService idGenerateService;

    @Override
    public AccountDTO addAccount(AccountAddDTO accountAddDTO) throws BusinessException{
        // 1.check the account is exist?
        Account existAccount = accountRepository.queryAccountByName(accountAddDTO.getName());
        //这里需要判断是否账号已经存在，如果不存在则抛出异常
        if(existAccount != null){
            log.error("[添加账户失败] {} 账户已经存在 （相同name）", accountAddDTO.getName());
            throw new BusinessException("账户已经存在", ExceptionEnum.ACCOUNT_ALREADY_EXIST);
        }
        // 2.generate uid
        String uid = idGenerateService.generateId();

        // 3.add account
        Date now = DateUtils.getNow();
        Account newAccount = new Account(new BigInteger(uid, 10),
                accountAddDTO.getName(),
                accountAddDTO.getPassword(),
                now, now);

        newAccount = accountRepository.save(newAccount);
        log.info("[add account success] add account id:{} is success", newAccount.getUid());
        return AccountDTO.build(newAccount.getUid().toString(), newAccount.getName());
    }

    @Override
    public void deleteAccount(String uid)  throws BusinessException{
        Account existAccount = accountRepository.findOne(new BigInteger(uid, 10));

        if(existAccount == null){
            log.error("[删除账户失败] id 为 {} 的账户不存在", uid);
            throw new BusinessException("账户不存在", ExceptionEnum.ACCOUNT_NOT_EXIST);
        }
        accountRepository.delete(existAccount);
        log.info("[delete account success] delete id:{} account is success!", uid);
    }

    @Override
    public AccountDTO queryAccountById(BigInteger uid){
        Account existAccount = accountRepository.findOne(uid);

        return AccountDTO.build(existAccount.getUid().toString(),
                existAccount.getName());
    }
}
