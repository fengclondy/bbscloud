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
        BigInteger uid = new BigInteger("100110020000000007", 10);
        BigInteger notExistUid = new BigInteger("900110020000000007", 10);
        int num = accountAttentionRepository.countAllByAttentionUid(uid);
        int num2 = accountAttentionRepository.countAllByAttentionUid(notExistUid);
        int num3 = accountAttentionRepository.countAllByAttentionUid(null);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }

    @Test
    public void testCountAllByAttentionedUid(){
        BigInteger uid = new BigInteger("100110020000000007", 10);
        BigInteger notExistUid = new BigInteger("900110020000000007", 10);
        int num = accountAttentionRepository.countAllByAttentionedUid(uid);
        int num2 = accountAttentionRepository.countAllByAttentionedUid(notExistUid);
        System.out.println(num);
        System.out.println(num2);
    }
}
