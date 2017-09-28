package com.iag.bbscloud.account.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:40
 * 账户数据统计，比如被关注数，关注人数，主页被访问次数，
 */
@Entity
@Data
@NoArgsConstructor
public class AccountStatistic {
    @Id
    @Column(nullable = false, unique = true)
    private BigInteger                          uid;
}
