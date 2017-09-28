package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 下午12:04
 */
@AllArgsConstructor
@Data
public class ArticleAddDTO {
    private BigInteger                  uid;
    private BigInteger                  bid;
    private String                      title;
    private String                      context;
}
