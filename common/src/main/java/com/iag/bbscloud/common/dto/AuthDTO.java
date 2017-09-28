package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 上午11:34
 * 身份认证DTO
 */
@Data
@AllArgsConstructor
public class AuthDTO {
    private String              token;

    public static AuthDTO build(String token){
        return new AuthDTO(token);
    }
}
