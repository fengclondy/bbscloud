package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/**
 * Created by beishan on 2017/9/28.
 */
@Data
@AllArgsConstructor
public class ResponseDTO<T> {
    private static final String SUCCESS_CODE = "00000000";
    private String                  code;
    private String                  message;
    private T                       data;

    public static ResponseDTO build(String code, String message, Object data){
        return new ResponseDTO(code, message, data);
    }
    public static ResponseDTO buildSuccess(String message, Object data){
        return ResponseDTO.build(SUCCESS_CODE, message, data);
    }

    public static ResponseDTO buildSuccess(String message){
        return ResponseDTO.buildSuccess(message, null);
    }
}
