package com.iag.bbscloud.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/2 下午1:48
 * 交易记录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TradeRecord {
    @Id
    @Column(nullable = false, unique = true)
    private BigInteger                  trid;
    // 交易人
    @Column
    private BigInteger                  trader;
    // 交易额
    @Column
    private BigDecimal                  turnover;
    // 交易类型
    @Column
    private Integer                     type;
    // 交易明细
    @Column
    private String                      detail;
    @Column
    private Date                        tradeTime;
    @Column
    private Date                        lastModifyTime;
}
