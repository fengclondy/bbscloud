package com.iag.bbscloud.idcenter.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午4:43
 */
@Slf4j
public class IdGenerateUtils {

    /**
     * id 填充，不满10位前面补0
     * @param id
     * @return
     * @throws Exception
     */
    public static String fillId10Bit(String id) throws Exception{
        int idLength = id.length();

        String bit [] = {
                "",
                "0",
                "00",
                "000",
                "0000",
                "00000",
                "000000",
                "0000000",
                "00000000",
                "000000000",
        };

        if(idLength >= 10 || idLength < 1){
            log.error("[generate id] id 长度错误");
            throw new Exception("[generate id] id 长度错误");
        }else {
            String finalId = bit[10 - idLength] + id;
            log.debug("[generate id] id = {}", finalId);
            return finalId;
        }
    }
}
