package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 上午11:39
 * 账户授权
 */
@AllArgsConstructor
@Data
public class AccountAuthDTO {
    private String              account;
    private String              password;
}
