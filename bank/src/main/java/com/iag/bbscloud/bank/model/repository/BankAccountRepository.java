package com.iag.bbscloud.bank.model.repository;

import com.iag.bbscloud.bank.model.BankAccount;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * Created by beishan on 2017/10/3.
 */
public interface BankAccountRepository extends CrudRepository<BankAccount, BigInteger>{

    BankAccount queryFirstByUid(BigInteger uid);
}
