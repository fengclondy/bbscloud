package com.iag.bbscloud.bank.service.impl;

import com.iag.bbscloud.bank.dto.TradeRecordMqDTO;
import com.iag.bbscloud.bank.model.BankAccount;
import com.iag.bbscloud.bank.model.repository.BankAccountRepository;
import com.iag.bbscloud.bank.mq.TradeRecordMqProduct;
import com.iag.bbscloud.bank.service.BankAccountService;
import com.iag.bbscloud.common.dto.BankAccountDTO;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.common.enums.TradeTypeEnum;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/**
 * Created by beishan on 2017/10/3.
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.idcenter.url}")
    private String idcenterServerUrl;

    @Autowired
    private TradeRecordMqProduct tradeRecordMqProduct;

    @Override
    public BankAccountDTO createAccount(BigInteger uid) throws BusinessException{

        BankAccount bankAccount = bankAccountRepository.queryFirstByUid(uid);
        if(Objects.nonNull(bankAccount)){
            throw new BusinessException("bank account is already exist", ExceptionEnum.BANK_ACCOUNT_ALREADY_EXIST);
        }
        String baids = restTemplate.getForObject(idcenterServerUrl + "/id?bizTag=" + BizTagEnum.BAID.getValue(), String.class);
        BigInteger bankAccountId = new BigInteger(baids, 10);
        bankAccount = new BankAccount(bankAccountId, uid, new BigDecimal(0));

        bankAccount = bankAccountRepository.save(bankAccount);

        // 异步 记录 [账户创建]事件
        TradeRecordMqDTO tradeRecordMqDTO = TradeRecordMqDTO.build(
            bankAccountId,
                new BigDecimal(0),
                TradeTypeEnum.CREATE,
                "account create"
        );
        tradeRecordMqProduct.send(tradeRecordMqDTO);

        return BankAccountDTO.build(bankAccount.getBaid(), bankAccount.getUid(), bankAccount.getBalance());
    }

    @Override
    public BankAccountDTO queryAccountByBankAccountId(BigInteger baid) throws BusinessException {
        BankAccount bankAccount = bankAccountRepository.findOne(baid);
        if(!Objects.nonNull(bankAccount)){
            throw new BusinessException("bank account is not exist", ExceptionEnum.BANK_ACCOUNT_NOTEXIST);
        }
        return BankAccountDTO.build(bankAccount.getBaid(), bankAccount.getUid(), bankAccount.getBalance());
    }

    @Override
    public BankAccountDTO queryAccountByUid(BigInteger uid) throws BusinessException {
        BankAccount bankAccount = bankAccountRepository.queryFirstByUid(uid);
        if(!Objects.nonNull(bankAccount)){
            throw new BusinessException("bank account is not exist", ExceptionEnum.BANK_ACCOUNT_NOTEXIST);
        }
        return BankAccountDTO.build(bankAccount.getBaid(), bankAccount.getUid(), bankAccount.getBalance());
    }
}
