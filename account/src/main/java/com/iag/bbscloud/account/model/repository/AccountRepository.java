package com.iag.bbscloud.account.model.repository;

import com.iag.bbscloud.account.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:24
 */
public interface AccountRepository extends CrudRepository<Account, BigInteger> {

    Account queryAccountByUidAndName(String uid, String name);

    Account queryAccountByName(String name);
    @Query("update Account as a set a.accountDelete = ?1 where a.uid = ?2")
    @Modifying
    @Transactional
    void updateAccountDelete(int deleteStatus, BigInteger uid);
}
