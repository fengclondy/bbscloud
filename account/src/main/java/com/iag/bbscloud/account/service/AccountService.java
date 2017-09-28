package com.iag.bbscloud.account.service;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.EntityOperateException;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:18
 */
public interface AccountService {
    /**
     * 添加账户
     * @param accountAddDTO
     */
    AccountDTO addAccount(AccountAddDTO accountAddDTO) throws BusinessException;

    /**
     * 删除账户
     * @param uid
     */
    void deleteAccount(String uid) throws BusinessException;

    AccountDTO queryAccountById(BigInteger uid);
}
