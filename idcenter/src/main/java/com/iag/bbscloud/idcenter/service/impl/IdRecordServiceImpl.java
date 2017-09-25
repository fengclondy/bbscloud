package com.iag.bbscloud.idcenter.service.impl;

import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.idcenter.model.IdRecord;
import com.iag.bbscloud.idcenter.model.repository.IdRecordRepository;
import com.iag.bbscloud.idcenter.service.IdRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:31
 */
@Service
public class IdRecordServiceImpl implements IdRecordService {
    @Autowired
    private IdRecordRepository idRecordRepository;

    @Override
    public String getAndIncId() {
        IdRecord idRecord = idRecordRepository.findOne(1L);
        if (idRecord == null){
            Date now = DateUtils.getNow();
            idRecord = new IdRecord(1L, now, now);
            idRecord = idRecordRepository.save(idRecord);
        }

        // inc and update incid
        Long incId = idRecord.getIncid();
        incId ++;
        idRecord.setIncid(incId);
        idRecordRepository.save(idRecord);

        return incId.toString();
    }
}
