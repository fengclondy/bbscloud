package com.iag.bbscloud.account.model;

import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.enums.TrueOrFalseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:02
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(generator = "ass")
    @GenericGenerator(name = "ass", strategy = "assigned")
    @Column(nullable = false, unique = true)
    private Long                                uid;
    @Column(nullable = false)
    private String                              name;
    @Column
    private Integer                             accountEnable;
    @Column
    private Integer                             accountDelete;
    @Column
    private String                              password;
    @Column
    private Date                                createTime;
    @Column
    private Date                                lastModifyTime;

    public Account(Long uid, String name, String password) {
        this.uid = uid;
        this.name = name;
        this.password = password;
        this.accountEnable = TrueOrFalseEnum.TRUE.getIntValue();
        this.accountDelete = TrueOrFalseEnum.FALSE.getIntValue();
        Date now = DateUtils.getNow();
        this.createTime = now;
        this.lastModifyTime = now;
    }
}
