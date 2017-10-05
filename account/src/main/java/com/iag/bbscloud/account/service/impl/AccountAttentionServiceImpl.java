package com.iag.bbscloud.account.service.impl;

import com.iag.bbscloud.account.model.AccountAttention;
import com.iag.bbscloud.account.model.repository.AccountAttentionRepository;
import com.iag.bbscloud.account.service.AccountAttentionService;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:54
 */
@Service
public class AccountAttentionServiceImpl implements AccountAttentionService {
    @Autowired
    private AccountAttentionRepository accountAttentionRepository;

    @Override
    public void attention(Long attentionUid, Long attentionedUid){
        Date now = DateUtils.getNow();
        AccountAttention accountAttention = new AccountAttention(attentionUid, attentionedUid, now);
        accountAttentionRepository.save(accountAttention);
    }

    @Override
    public void cancelAttention(Long attentionUid, Long attentionedUid) throws BusinessException {
        AccountAttention exist = accountAttentionRepository.queryFirstByAttentionUidAndAttentionedUid(attentionUid, attentionedUid);
        if(exist != null){
            accountAttentionRepository.delete(exist);
        }
    }

    @Override
    public int countAttentionNum(Long uid) {
        return accountAttentionRepository.countAllByAttentionUid(uid);
    }

    @Override
    public int countAttentionedNum(Long uid) {
        return accountAttentionRepository.countAllByAttentionedUid(uid);
    }
}
