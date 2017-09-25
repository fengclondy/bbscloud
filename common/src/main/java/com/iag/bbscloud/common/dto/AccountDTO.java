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
    private String                      uid;
    private String                      name;

    public static AccountDTO build(String uid, String name){
        return new AccountDTO(uid, name);
    }
}
