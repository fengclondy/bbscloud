package com.iag.bbscloud.common.date;

import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午3:39
 */
public class DateUtils {
    /**
     * 获取当前时间
     * @return
     */
    public static Date getNow(){
        return new Date();
    }

    /**
     * 获取当前时间的毫秒值
     * @return
     */
    public static Long getNowMills(){
        return System.currentTimeMillis();
    }
}
