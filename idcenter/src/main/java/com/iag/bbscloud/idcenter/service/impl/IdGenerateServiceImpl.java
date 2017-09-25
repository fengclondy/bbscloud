package com.iag.bbscloud.idcenter.service.impl;

import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.idcenter.service.IdGenerateService;
import com.iag.bbscloud.idcenter.service.IdRecordService;
import com.iag.bbscloud.idcenter.utils.IdGenerateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:18
 */
@Service
public class IdGenerateServiceImpl implements IdGenerateService {

    @Value("${idcenter.num}")
    private String idcenterNum;
    @Value("${id.fill}")
    private String fill;

    @Autowired
    private IdRecordService idRecordService;


    @Override
    public synchronized String generateId(BizTagEnum bizTagEnum) throws Exception{
        String incid = idRecordService.getAndIncId();
        incid = IdGenerateUtils.fillId10Bit(incid);
        /**
         * 方案1
         * mills(约等于 13bit) + idcenter(4bit) + bizTag(4bit) + incid(10bit) = 31 bit
         * mills bit 会随着时间增加
         */
        //String id = DateUtils.getNowMills().toString() + idcenterNum + bizTagEnum.getName() + incid;

        /**
         * 方案2
         * fill(2bit) + idcenter(4it) + bizTag(4bit) + incid(10bit) = 20bit
         */
        String id = fill + idcenterNum + bizTagEnum.getName() + incid;

        return id;
    }
}
