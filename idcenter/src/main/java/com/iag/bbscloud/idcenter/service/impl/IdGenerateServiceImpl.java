package com.iag.bbscloud.idcenter.service.impl;

import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.idcenter.service.IdGenerateService;
import com.iag.bbscloud.idcenter.service.IdRecordService;
import com.iag.bbscloud.idcenter.utils.IdGenerateUtils;
import com.iag.bbscloud.idcenter.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:18
 */
@Service
public class IdGenerateServiceImpl implements IdGenerateService {

    @Value("${idcenter.id}")
    private String idcenterid;

    @Autowired
    private IdRecordService idRecordService;

    @Override
    public Long generateId(BizTagEnum bizTagEnum) throws Exception{
        Long idcenter = Long.parseLong(idcenterid, 2);
        Long biz = Long.parseLong(bizTagEnum.getName(), 2);
        IdWorker idWorker = new IdWorker(idcenter, biz);

        return idWorker.nextId();
    }
}
