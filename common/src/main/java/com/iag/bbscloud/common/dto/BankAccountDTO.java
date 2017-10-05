package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/3.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDTO {
    private BigInteger                      baid;
    private BigInteger                      uid;
    private BigDecimal                      balance;

    public static BankAccountDTO build(BigInteger baid, BigInteger uid, BigDecimal balance){
        return new BankAccountDTO(baid, uid, balance);
    }
}
