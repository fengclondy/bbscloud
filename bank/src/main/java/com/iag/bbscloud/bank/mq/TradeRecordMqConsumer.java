package com.iag.bbscloud.bank.mq;

import com.iag.bbscloud.bank.dto.TradeRecordMqDTO;
import com.iag.bbscloud.bank.service.TradeRecordService;
import com.iag.bbscloud.common.dto.TradeRecordDTO;
import com.iag.bbscloud.common.enums.MqChannelEnums;
import com.iag.bbscloud.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by beishan on 2017/10/4.
 */
@Component
@RabbitListener(queues = MqChannelEnums.BANK_TRADE_RECORD)
@Slf4j
public class TradeRecordMqConsumer {
    @Autowired
    private TradeRecordService tradeRecordService;

    @RabbitHandler
    public void process(TradeRecordMqDTO tradeRecordMqDTO){
        System.out.println("Receivr : " + tradeRecordMqDTO);
        TradeRecordDTO tradeRecordDTO = TradeRecordDTO.build(
                null,
                tradeRecordMqDTO.getBaid(),
                tradeRecordMqDTO.getTurnover(),
                tradeRecordMqDTO.getType(),
                tradeRecordMqDTO.getDetail(),
                null
                );
        try {
            tradeRecordService.addTradeRecord(tradeRecordDTO);
        } catch (BusinessException e) {
            log.error("[trade record create fail] baid : {}, detail : {}",
                    tradeRecordDTO.getBaid(),
                    tradeRecordDTO.toString());
        }
    }
}
