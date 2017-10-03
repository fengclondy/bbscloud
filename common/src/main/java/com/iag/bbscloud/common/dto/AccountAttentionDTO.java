package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/29 上午11:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountAttentionDTO {
    private BigInteger              attentionUid;
    private BigInteger              attentionedUid;
}
