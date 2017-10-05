package com.iag.bbscloud.account.model;

import com.iag.bbscloud.account.AccountApplicationTest;
import com.iag.bbscloud.account.model.repository.AccountAttentionRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:59
 */
public class AccountAttentionRepositoryTest extends AccountApplicationTest {

    @Autowired
    private AccountAttentionRepository accountAttentionRepository;

    @Test
    public void testCountAllByAttentionUid(){
        Long uid = 34695595229184L;
        Long notExistUid = 147653333L;
        int num = accountAttentionRepository.countAllByAttentionUid(uid);
        int num2 = accountAttentionRepository.countAllByAttentionUid(notExistUid);
        int num3 = accountAttentionRepository.countAllByAttentionUid(null);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }

    @Test
    public void testCountAllByAttentionedUid(){
        Long uid = 147653333L;
        Long notExistUid = 147653333L;
        int num = accountAttentionRepository.countAllByAttentionedUid(uid);
        int num2 = accountAttentionRepository.countAllByAttentionedUid(notExistUid);
        System.out.println(num);
        System.out.println(num2);
    }
}
