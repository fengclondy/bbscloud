package com.iag.bbscloud.common.exception;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:39
 */
public class ParameterException extends BusinessException {
    public ParameterException(String message, ExceptionEnum ee) {
        super(message, ee);
    }
}
