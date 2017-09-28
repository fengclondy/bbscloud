package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 上午11:46
 */
@Data
@AllArgsConstructor
public class ArticleDTO {
    private BigInteger              aid;
    private BigInteger              uid;
    private BigInteger              bid;
    private String                  title;
    private String                  context;
    private Date                    createTime;
    private Date                    lastModifyTime;

    public static ArticleDTO build(BigInteger aid, BigInteger uid, BigInteger bid, String title, String context, Date createTime, Date lastModifyTime){
        return new ArticleDTO(aid, uid, bid, title, context, createTime, lastModifyTime);
    }
}
