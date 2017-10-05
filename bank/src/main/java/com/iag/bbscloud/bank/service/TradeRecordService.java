package com.iag.bbscloud.bank.service;

import com.iag.bbscloud.common.dto.TradeRecordDTO;
import com.iag.bbscloud.common.exception.BusinessException;

/**
 * Created by beishan on 2017/10/3.
 */
public interface TradeRecordService {
    TradeRecordDTO addTradeRecord(TradeRecordDTO tradeRecordDTO) throws BusinessException;
}
