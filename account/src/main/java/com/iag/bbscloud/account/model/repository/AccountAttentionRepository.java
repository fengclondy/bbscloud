package com.iag.bbscloud.account.model.repository;

import com.iag.bbscloud.account.model.AccountAttention;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:43
 */
public interface AccountAttentionRepository extends CrudRepository<AccountAttention, Long> {

    int countAllByAttentionUid(BigInteger attentionUid);

    int countAllByAttentionedUid(BigInteger attentionedUid);

    AccountAttention queryFirstByAttentionUidAndAttentionedUid(BigInteger attentionUid, BigInteger attentionedId);
}
