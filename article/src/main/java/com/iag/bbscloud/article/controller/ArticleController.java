package com.iag.bbscloud.article.controller;

import com.iag.bbscloud.article.service.ArticleService;
import com.iag.bbscloud.common.dto.ArticleAddDTO;
import com.iag.bbscloud.common.dto.ArticleDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 下午4:11
 */
@RestController
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/{aid}")
    public ArticleDTO querySingleArticle(@PathVariable BigInteger aid) throws ParameterException{
        return articleService.querySingleArticle(aid);
    }

    @PostMapping("/article")
    public ArticleDTO addArticle(@RequestBody ArticleAddDTO articleAddDTO) throws BusinessException {
        return articleService.addArticle(articleAddDTO);
    }
}
