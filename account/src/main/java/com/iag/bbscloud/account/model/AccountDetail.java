package com.iag.bbscloud.account.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:14
 */
@Entity
@Data
public class AccountDetail {
    @Id
    @Column(nullable = false, unique = true)
    private Long                            uid;
    @Column
    private String                          info;
}
