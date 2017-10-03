package com.iag.bbscloud.common.enums;

import lombok.Getter;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:13
 */
@Getter
public enum BizTagEnum {
    // 用户ID
    UID(0, "1001"),
    //article ID
    AID(1, "1002"),
    // reply
    RID(2, "1003"),
    // board
    BID(3, "1004"),
    // bank account id
    BRID(4, "5001"),
    // trade record id
    TRADE_RECORD_ID(5, "5002"),
    ;
    private int value;
    private String name;
    BizTagEnum(int value, String name){
        this.value = value;
        this.name = name;
    }

    public static BizTagEnum index(int index){
        switch (index){
            case 0 : return UID;
            case 1 : return AID;
            case 2 : return RID;
            case 3 : return BID;
            default: return null;
        }
    }
}
