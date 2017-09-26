package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:49
 */
@Data
@AllArgsConstructor
public class BoardAddDTO {
    //创建人ID
    private BigInteger                  uid;
    private String                      name;
}
