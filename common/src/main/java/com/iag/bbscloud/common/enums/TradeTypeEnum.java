package com.iag.bbscloud.common.enums;

import lombok.Getter;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/2 下午1:56
 * 交易类型
 */
@Getter
public enum TradeTypeEnum {
    // 创建账户
    CREATE("chuangjian", 0),
    // 转账
    TRANSFER("zhuanzhang", 1),
    // 消费
    EXPENSE("xiaofei", 2),
    // 系统奖励
    SYSTEM_AWARD("xitongjiangli", 3);
    ;
    private String                  name;
    private Integer                 value;

    TradeTypeEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public static TradeTypeEnum index(int value){
        switch (value){
            case 0 : return CREATE;
            case 1 : return TRANSFER;
            case 2 : return EXPENSE;
            case 3 : return SYSTEM_AWARD;
            default: return null;
        }
    }
}
