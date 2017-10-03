package com.iag.bbscloud.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
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
    private BigInteger                  baid;
    // 用户ID
    private BigInteger                  uid;
    private BigDecimal                  balance;

    private Date                        createTime;
    private Date                        lastModifyTime;
}
