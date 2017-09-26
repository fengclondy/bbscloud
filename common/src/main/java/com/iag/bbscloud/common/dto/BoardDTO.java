package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private BigInteger                      bid;
    private BigInteger                      uid;
    private String                          name;
    private Date                            createTime;
    private Date                            lastModifyTime;

    public static BoardDTO build(BigInteger bid, BigInteger uid, String name, Date createTime, Date lastModifyTime){
        return new BoardDTO(bid, uid, name, createTime, lastModifyTime);
    }
}
