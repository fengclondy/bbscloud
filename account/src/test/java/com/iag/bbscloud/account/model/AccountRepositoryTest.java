package com.iag.bbscloud.account.model;

import com.iag.bbscloud.account.AccountApplicationTest;
import com.iag.bbscloud.account.model.repository.AccountRepository;
import com.iag.bbscloud.common.enums.TrueOrFalseEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午10:44
 */
public class AccountRepositoryTest extends AccountApplicationTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testUpdateAccountDelete(){
        Long uid = 17520071479323L;
        accountRepository.updateAccountDelete(TrueOrFalseEnum.TRUE.getIntValue(), uid);
    }
}
