package com.iag.bbscloud.bank.mq;

import com.iag.bbscloud.bank.dto.TradeRecordMqDTO;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.enums.MqChannelEnums;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by beishan on 2017/10/4.
 */
@Component
public class TradeRecordMqProduct {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(TradeRecordMqDTO tradeRecordMqDTO){
        String context = DateUtils.getNow().toString();
        System.out.println("产生交易，异步交易记录 : " + context);

        this.amqpTemplate.convertAndSend(MqChannelEnums.BANK_TRADE_RECORD, tradeRecordMqDTO);
    }


}
