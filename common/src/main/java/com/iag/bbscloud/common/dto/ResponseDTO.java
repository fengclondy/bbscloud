package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by beishan on 2017/9/28.
 */
@Data
@AllArgsConstructor
public class ResponseDTO {
    private String                  code;
    private String                  message;
    private Object                  data;

    public static ResponseDTO build(String code, String message, Object data){
        return new ResponseDTO(code, message, data);
    }
}
