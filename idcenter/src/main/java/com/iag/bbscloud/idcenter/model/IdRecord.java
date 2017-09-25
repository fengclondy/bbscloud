package com.iag.bbscloud.idcenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:26
 */
@Entity
@Data
@NoArgsConstructor
public class IdRecord {
    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private Long                                id;
    @Column
    private Long                                incid;
    @Column
    private Date                                createTime;
    @Column
    private Date                                lastModifyTime;

    public IdRecord(Long incid, Date createTime, Date lastModifyTime) {
        this.incid = incid;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
    }
}
