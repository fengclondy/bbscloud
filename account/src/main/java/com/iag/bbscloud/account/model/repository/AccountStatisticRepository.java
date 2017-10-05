package com.iag.bbscloud.account.model.repository;

import com.iag.bbscloud.account.model.AccountStatistic;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:44
 */
public interface AccountStatisticRepository extends CrudRepository<AccountStatistic, Long> {
}
