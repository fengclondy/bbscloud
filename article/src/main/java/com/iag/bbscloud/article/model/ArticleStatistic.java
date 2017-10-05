package com.iag.bbscloud.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午3:27
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleStatistic {

    @Id
    @Column(nullable = false, unique = true)
    private Long                                aid;
    @Column
    private Long                                uid;
    // 板块ID
    @Column
    private Long                                bid;
    @Column
    private Integer                             viewCount;
    @Column
    private Integer                             praiseCount;
    @Column
    private Integer                             dislikeCount;
    //收藏
    @Column
    private Integer                             collectCount;
}
