package com.iag.bbscloud.getway.config;

import com.iag.bbscloud.getway.filter.AccessFilter;
import com.iag.bbscloud.getway.filter.ErrorFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午2:21
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }
}
