package com.iag.bbscloud.idcenter.service;

import com.iag.bbscloud.common.enums.BizTagEnum;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:16
 */
public interface IdGenerateService {
    /**
     * 生成ID
     * @param bizTagEnum
     * @return
     */
    Long generateId(BizTagEnum bizTagEnum) throws Exception;
}
