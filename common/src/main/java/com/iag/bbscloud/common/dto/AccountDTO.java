package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:21
 */
@Data
@AllArgsConstructor
public class AccountDTO {
    private Long                        uid;
    private String                      name;

    public static AccountDTO build(Long uid, String name){
        return new AccountDTO(uid, name);
    }
}
