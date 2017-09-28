package com.iag.bbscloud.board.model;

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
 * @Date 2017/9/26 下午4:05
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @Column(nullable = false, unique = true)
    private BigInteger                      bid;
    @Column
    private BigInteger                      uid;
    @Column
    private String                          name;
    @Column
    private Date                            createTime;
    @Column
    private Date                            lastModifyTime;
}
