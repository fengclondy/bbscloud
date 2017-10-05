package com.iag.bbscloud.bank.dto;

import com.iag.bbscloud.common.enums.TradeTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by beishan on 2017/10/4.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeRecordMqDTO {

    private BigInteger              baid;
    private BigDecimal              turnover;
    private TradeTypeEnum           type;
    private String                  detail;

    public static TradeRecordMqDTO build(BigInteger baid,
                                         BigDecimal turnover,
                                         TradeTypeEnum type,
                                         String detail){
        return new TradeRecordMqDTO(baid, turnover, type, detail);
    }
}
