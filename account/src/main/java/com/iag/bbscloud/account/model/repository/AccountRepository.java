package com.iag.bbscloud.account.model.repository;

import com.iag.bbscloud.account.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:24
 */
public interface AccountRepository extends CrudRepository<Account, String> {

    Account queryAccountByUidAndName(String uid, String name);

    Account queryAccountByName(String name);
}
