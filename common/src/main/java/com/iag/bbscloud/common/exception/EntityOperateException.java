package com.iag.bbscloud.common.exception;

import lombok.AllArgsConstructor;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:28
 */
public class EntityOperateException extends BusinessException {
    public EntityOperateException(String message, ExceptionEnum ee) {
        super(message, ee);
    }
}
