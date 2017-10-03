package com.iag.bbscloud.account.controller;

import com.iag.bbscloud.account.service.AccountAttentionService;
import com.iag.bbscloud.common.dto.AccountAttentionDTO;
import com.iag.bbscloud.common.dto.ResponseDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import com.iag.bbscloud.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/29 上午11:12
 */
@RestController
@Slf4j
public class AccountAttentionController {

    @Autowired
    private AccountAttentionService accountAttentionService;

    /**
     * 关注
     * @param accountAttentionDTO
     * @return
     * @throws ParameterException
     */
    @PostMapping("/attention")
    public ResponseDTO attention(@RequestBody AccountAttentionDTO accountAttentionDTO) throws ParameterException {
        // 校验参数
        if(Objects.nonNull(accountAttentionDTO)
                && Objects.nonNull(accountAttentionDTO.getAttentionUid())
                && Objects.nonNull(accountAttentionDTO.getAttentionedUid())
                && StringUtils.isNotBlank(accountAttentionDTO.getAttentionUid().toString())
                && StringUtils.isNotBlank(accountAttentionDTO.getAttentionedUid().toString())){
            accountAttentionService.attention(accountAttentionDTO.getAttentionUid(),
                    accountAttentionDTO.getAttentionedUid());
            return ResponseDTO.buildSuccess("关注成功");
        }else {
            throw new ParameterException("attention param error", ExceptionEnum.PARAMETER_ERROR);
        }
    }

    /**
     * 取消关注
     * @param accountAttentionDTO
     * @return
     * @throws BusinessException
     */
    @DeleteMapping("/attention")
    public ResponseDTO cancelAttention(@RequestBody AccountAttentionDTO accountAttentionDTO) throws BusinessException {
        // 校验参数
        if(Objects.nonNull(accountAttentionDTO)
                && Objects.nonNull(accountAttentionDTO.getAttentionUid())
                && Objects.nonNull(accountAttentionDTO.getAttentionedUid())
                && StringUtils.isNotBlank(accountAttentionDTO.getAttentionUid().toString())
                && StringUtils.isNotBlank(accountAttentionDTO.getAttentionedUid().toString())){
            accountAttentionService.cancelAttention(accountAttentionDTO.getAttentionUid(),
                    accountAttentionDTO.getAttentionedUid());
            return ResponseDTO.buildSuccess("关注成功");
        }else {
            throw new ParameterException("attention param error", ExceptionEnum.PARAMETER_ERROR);
        }
    }
}
