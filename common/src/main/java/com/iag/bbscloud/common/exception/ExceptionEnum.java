package com.iag.bbscloud.common.exception;

import lombok.Getter;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午2:50
 */
@Getter
public enum ExceptionEnum {
    // access
    ACCESS_DENIED("10010001", "访问拒绝"),

    // account
    ACCOUNT_NOT_EXIST("20000001", "账户不存在"),
    ACCOUNT_ALREADY_EXIST("20000002", "账户已经存在"),

    // article
    ARTICLE_NOT_EXIST("30000001", "article 不存在"),

    // reply
    REPLY_NOT_EXIST("31000001", "reply not exist"),

    // board
    BOARD_NOST_EXIST("32000001", "board not exist"),
    BOARD_ADD_ERROR("32010001", "board add error"),

    //bank
    BANK_ACCOUNT_NOTEXIST("40000001", "bank account not exist"),
    BANK_ACCOUNT_ALREADY_EXIST("40000002", "bank account already exist"),

    // business
    PARAMETER_ERROR("80000001", "parameter has error"),
    ;
    private String name;
    private String value;

    ExceptionEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
