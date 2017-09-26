package com.iag.bbscloud.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午3:13
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    @Column(nullable = false, unique = true)
    private BigInteger                      aid;
    @Column
    private BigInteger                      uid;
    // 板块ID
    @Column
    private BigInteger                      bid;
    @Column
    private String                          title;
    @Column
    private Date                            createTime;
    @Column
    private Date                            lastModifyTime;
}
