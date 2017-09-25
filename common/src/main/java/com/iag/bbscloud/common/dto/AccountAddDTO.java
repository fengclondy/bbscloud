package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:19
 */
@Data
@AllArgsConstructor
public class AccountAddDTO {
    private String                      name;
    private String                      password;
}
