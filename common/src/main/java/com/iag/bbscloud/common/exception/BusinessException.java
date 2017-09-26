package com.iag.bbscloud.common.exception;

import lombok.Data;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午2:50
 */
@Data
public class BusinessException extends Exception{
    protected ExceptionEnum ee;

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, ExceptionEnum ee) {
        super(message);
        this.ee = ee;
    }
}
