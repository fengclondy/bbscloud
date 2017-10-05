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
    private Long                    aid;
    private Long                    uid;
    private Long                    bid;
    private String                  title;
    private String                  context;
    private Date                    createTime;
    private Date                    lastModifyTime;

    public static ArticleDTO build(Long aid, Long uid, Long bid, String title, String context, Date createTime, Date lastModifyTime){
        return new ArticleDTO(aid, uid, bid, title, context, createTime, lastModifyTime);
    }
}
