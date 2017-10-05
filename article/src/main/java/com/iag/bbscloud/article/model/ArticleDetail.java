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
 * @Date 2017/9/26 下午3:17
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDetail {
    @Id
    @Column(nullable = false, unique = true)
    private Long                            aid;
    @Column
    private Long                            uid;
    // 板块ID
    @Column
    private Long                            bid;
    @Column
    private String                          context;
    @Column
    private Date                            createTime;
    @Column
    private Date                            lastModifyTime;
}
