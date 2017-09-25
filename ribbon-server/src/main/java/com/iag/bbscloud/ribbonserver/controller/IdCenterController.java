package com.iag.bbscloud.ribbonserver.controller;

import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.ribbonserver.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午5:35
 */
@RestController
public class IdCenterController {

    @Autowired
    private IdGenerateService idGenerateService;

    @GetMapping("id")
    public String generateId(@RequestParam Integer bizTag){
        return idGenerateService.generateId(BizTagEnum.index(bizTag));
    }
}
