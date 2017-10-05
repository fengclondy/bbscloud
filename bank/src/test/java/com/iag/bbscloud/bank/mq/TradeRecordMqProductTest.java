package com.iag.bbscloud.bank.mq;

import com.iag.bbscloud.bank.BankApplicationTest;
import com.iag.bbscloud.bank.dto.TradeRecordMqDTO;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.enums.TradeTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/4.
 */
public class TradeRecordMqProductTest extends BankApplicationTest {

    @Autowired
    private TradeRecordMqProduct tradeRecordMqProduct;

    @Test
    public void testSend(){
        BigInteger trader = new BigInteger("100110010000000015", 10);
        BigDecimal turnover = new BigDecimal(100.54);
        TradeRecordMqDTO tradeRecordMqDTO = TradeRecordMqDTO.build(
                trader,
                turnover,
                TradeTypeEnum.EXPENSE,
                "没有明细"
        );

        for(int i = 0; i < 10; i++){
            tradeRecordMqDTO.setDetail("第 " + i + " 次");
            tradeRecordMqProduct.send(tradeRecordMqDTO);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
