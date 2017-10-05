package com.iag.bbscloud.common.dto;

import com.iag.bbscloud.common.enums.TradeTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by beishan on 2017/10/5.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeRecordDTO {
    private BigInteger              trid;
    private BigInteger              baid;
    private BigDecimal              turnover;
    private TradeTypeEnum           type;
    private String                  detail;
    private Date                    tradeTime;

    public static TradeRecordDTO build(BigInteger trid,
                                        BigInteger baid,
                                         BigDecimal turnover,
                                         TradeTypeEnum type,
                                         String detail,
                                         Date tradeTime){
        return new TradeRecordDTO(trid, baid, turnover, type, detail, tradeTime);
    }
}
