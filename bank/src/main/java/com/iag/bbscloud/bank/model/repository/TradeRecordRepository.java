package com.iag.bbscloud.bank.model.repository;

import com.iag.bbscloud.bank.model.TradeRecord;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by beishan on 2017/10/3.
 */
public interface TradeRecordRepository extends CrudRepository<TradeRecord, BigInteger> {
    List<TradeRecord> queryAllByBaid(BigInteger baid);

}
