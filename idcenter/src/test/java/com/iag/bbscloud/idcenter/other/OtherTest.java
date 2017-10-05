package com.iag.bbscloud.idcenter.other;

import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/5 下午2:05
 */
public class OtherTest {

    @Test
    public void testMills(){
        Long mills = System.currentTimeMillis();
        System.out.println("mills = " + mills);
        System.out.println(Long.toBinaryString(mills));

        Long m = -1L;
        Long m_left = m << 5;
        System.out.println(Long.toBinaryString(m));
        System.out.println(Long.toBinaryString(m_left));
        System.out.println(Long.toBinaryString(m_left ^ -1L));

    }
}
