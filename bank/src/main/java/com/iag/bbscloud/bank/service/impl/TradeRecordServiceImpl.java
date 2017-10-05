package com.iag.bbscloud.bank.service.impl;

import com.iag.bbscloud.bank.model.TradeRecord;
import com.iag.bbscloud.bank.model.repository.TradeRecordRepository;
import com.iag.bbscloud.bank.service.TradeRecordService;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.dto.TradeRecordDTO;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.common.enums.TradeTypeEnum;
import com.iag.bbscloud.common.exception.BusinessException;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/5.
 */
@Service
public class TradeRecordServiceImpl implements TradeRecordService {

    @Autowired
    private TradeRecordRepository tradeRecordRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.idcenter.url}")
    private String idcenterServerUrl;

    @Override
    public TradeRecordDTO addTradeRecord(TradeRecordDTO tradeRecordDTO) throws BusinessException {

        String tradeidStr = restTemplate.getForObject(idcenterServerUrl + "/id?bizTag=" + BizTagEnum.TRADE_RECORD_ID.getValue(), String.class);
        BigInteger trid = new BigInteger(tradeidStr, 10);

        TradeRecord record = new TradeRecord(
                trid,
                tradeRecordDTO.getBaid(),
                tradeRecordDTO.getTurnover(),
                tradeRecordDTO.getType().getValue(),
                tradeRecordDTO.getDetail()
        );
        record = tradeRecordRepository.save(record);
        return TradeRecordDTO.build(
            trid,
                record.getBaid(),
                record.getTurnover(),
                TradeTypeEnum.index(record.getType()),
                record.getDetail(),
                record.getTradeTime()
        );
    }
}
