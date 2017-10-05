package com.iag.bbscloud.common.enums;

import lombok.Getter;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:13
 */
@Getter
public enum BizTagEnum {
    // 用户ID
    UID(0, "10000"),
    //article ID
    AID(1, "10001"),
    // reply
    RID(2, "10010"),
    // board
    BID(3, "10011"),
    // bank account id
    BAID(4, "10100"),
    // trade record id
    TRADE_RECORD_ID(5, "10101"),
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
            case 4 : return BAID;
            case 5 : return TRADE_RECORD_ID;
            default: return null;
        }
    }
}
