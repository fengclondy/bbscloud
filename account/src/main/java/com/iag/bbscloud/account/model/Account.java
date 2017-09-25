package com.iag.bbscloud.account.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
    @Column(nullable = false, unique = true)
    private String                              name;
    @Column
    private String                              password;
    @Column
    private Date                                createTime;
    @Column
    private Date                                lastModifyTime;
}
