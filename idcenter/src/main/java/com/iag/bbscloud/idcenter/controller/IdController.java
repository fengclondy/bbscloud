package com.iag.bbscloud.idcenter.controller;

import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.idcenter.service.IdGenerateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/25 下午5:00
 */
@RestController
@Slf4j
public class IdController {
    @Autowired
    private IdGenerateService idGenerateService;

    @GetMapping("id")
    public String generateId(@RequestParam Integer bizTag) throws Exception {
        String id = idGenerateService.generateId(BizTagEnum.index(bizTag));

        return id;
    }
}
