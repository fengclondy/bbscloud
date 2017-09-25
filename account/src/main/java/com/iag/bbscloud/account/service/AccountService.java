package com.iag.bbscloud.account.service;

import com.iag.bbscloud.common.dto.AccountAddDTO;
import com.iag.bbscloud.common.dto.AccountDTO;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:18
 */
public interface AccountService {
    /**
     * 添加账户
     * @param accountAddDTO
     */
    AccountDTO addAccount(AccountAddDTO accountAddDTO);

    /**
     * 删除账户
     * @param uid
     */
    void deleteAccount(String uid);
}
