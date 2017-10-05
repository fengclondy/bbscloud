package com.iag.bbscloud.bank.mq;

import com.iag.bbscloud.common.enums.MqChannelEnums;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by beishan on 2017/10/4.
 */
public interface MqInterface {
    @Input(MqChannelEnums.BANK_TRADE_RECORD)
    SubscribableChannel inputChannel();

    @Output(MqChannelEnums.BANK_TRADE_RECORD)
    MessageChannel outputChannel();
}
