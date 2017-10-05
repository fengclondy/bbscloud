package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/5.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountAddDTO {
    private BigInteger                  uid;
}
