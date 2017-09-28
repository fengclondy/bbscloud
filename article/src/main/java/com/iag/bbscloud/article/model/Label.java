package com.iag.bbscloud.article.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/27 上午9:32
 */
@Entity
@Data
@NoArgsConstructor
public class Label {

    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private Long                            lid;
    @Column
    private String                          name;
}
