package com.iag.bbscloud.account.service;

import com.iag.bbscloud.common.exception.BusinessException;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:48
 */
public interface AccountAttentionService {
    /**
     * 关注某人操作
     * @param attentionUid 关注人ID
     * @param attentionedUid 被关注人ID
     * @throws BusinessException
     */
    void attention(BigInteger attentionUid, BigInteger attentionedUid);

    /**
     * 取消关注某人
     * @param attentionUid 关注人ID
     * @param attentionedUid 被关注人ID
     * @throws BusinessException
     */
    void cancelAttention(BigInteger attentionUid, BigInteger attentionedUid) throws BusinessException;

    /**
     * 统计某人关注的人数
     * @param uid
     * @return
     */
    int countAttentionNum(BigInteger uid);

    /**
     * 统计某人被关注的次数
     * @param uid
     * @return
     */
    int countAttentionedNum(BigInteger uid);
}
