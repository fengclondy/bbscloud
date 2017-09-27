package com.iag.bbscloud.common.enums;

import lombok.Getter;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午10:28
 */
@Getter
public enum TrueOrFalseEnum {
    TRUE(true, 1),
    FALSE(false, 0)
    ;
    private boolean             booleanValue;
    private int                 intValue;

    TrueOrFalseEnum(boolean booleanValue, int intValue) {
        this.booleanValue = booleanValue;
        this.intValue = intValue;
    }
}
