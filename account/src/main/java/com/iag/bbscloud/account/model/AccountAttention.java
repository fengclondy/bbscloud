package com.iag.bbscloud.account.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:36
 */
@Entity
@Data
@NoArgsConstructor
public class AccountAttention {
    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private Long                            aaid;
    // 关注人ID
    @Column
    private BigInteger                      attentionUid;
    // 被关注人ID
    @Column
    private BigInteger                      attentionedUid;
    //关注时候的时间
    @Column
    private Date                            attentionTime;

    public AccountAttention(BigInteger attentionUid, BigInteger attentionedUid, Date attentionTime) {
        this.attentionUid = attentionUid;
        this.attentionedUid = attentionedUid;
        this.attentionTime = attentionTime;
    }
}
