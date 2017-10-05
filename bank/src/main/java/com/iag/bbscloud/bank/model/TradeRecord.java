package com.iag.bbscloud.bank.model;

import com.iag.bbscloud.common.date.DateUtils;
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
    // 交易账户
    @Column
    private BigInteger                  baid;
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

    public TradeRecord(BigInteger trid, BigInteger baid, BigDecimal turnover, Integer type, String detail) {
        this.trid = trid;
        this.baid = baid;
        this.turnover = turnover;
        this.type = type;
        this.detail = detail;
        Date now = DateUtils.getNow();
        this.tradeTime = now;
        this.lastModifyTime = now;
    }
}
