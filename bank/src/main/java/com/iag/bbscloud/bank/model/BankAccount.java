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
 * @Date 2017/10/2 下午1:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankAccount {
    // 银行账户ID
    @Id
    @Column(nullable = false, unique = true)
    private BigInteger                  baid;
    // 用户ID
    @Column
    private BigInteger                  uid;
    @Column
    private BigDecimal                  balance;
    @Column
    private Date                        createTime;
    @Column
    private Date                        lastModifyTime;


    public BankAccount(BigInteger baid, BigInteger uid, BigDecimal balance) {
        this.baid = baid;
        this.uid = uid;
        this.balance = balance;
        Date now = DateUtils.getNow();
        this.createTime = now;
        this.lastModifyTime = now;
    }
}
