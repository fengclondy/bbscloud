package com.iag.bbscloud.article.model;

import com.iag.bbscloud.common.date.DateUtils;
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
    private Long                            aid;
    @Column
    private Long                            uid;
    // 板块ID
    @Column
    private Long                            bid;
    @Column
    private String                          title;
    @Column
    private Date                            createTime;
    @Column
    private Date                            lastModifyTime;

    public Article(Long aid, Long uid,  Long bid, String title) {
        this.aid = aid;
        this.uid = uid;
        this.bid = bid;
        this.title = title;
        Date now = DateUtils.getNow();
        this.createTime = now;
        this.lastModifyTime = now;
    }
}
