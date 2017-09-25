package com.iag.bbscloud.idcenter.service;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:29
 */
public interface IdRecordService {

    /**
     * 得到最后的ID并自增1
     * @return
     */
    String getAndIncId();
}
