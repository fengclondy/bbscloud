package com.iag.bbscloud.idcenter.utils;

import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/5 下午3:11
 */
public class IdWorkerTest {
    @Test
    public void testGenerateId(){
        long idcenterid = Long.parseLong("10001", 2);
        System.out.println(idcenterid);
        long bizid = Long.parseLong("10001", 2);
        System.out.println(bizid);

        IdWorker idWorker = new IdWorker(idcenterid, bizid);

        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(id);
            System.out.println(Long.toBinaryString(id));
        }
    }
}
