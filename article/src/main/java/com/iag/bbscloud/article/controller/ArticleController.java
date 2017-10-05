package com.iag.bbscloud.article.controller;

import com.iag.bbscloud.article.service.ArticleService;
import com.iag.bbscloud.common.dto.ArticleAddDTO;
import com.iag.bbscloud.common.dto.ArticleDTO;
import com.iag.bbscloud.common.dto.ResponseDTO;
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
    public ResponseDTO querySingleArticle(@PathVariable Long aid) throws ParameterException{
        ArticleDTO articleDTO = articleService.querySingleArticle(aid);
        return ResponseDTO.buildSuccess("查询成功", articleDTO);
    }

    @PostMapping("/article")
    public ResponseDTO addArticle(@RequestBody ArticleAddDTO articleAddDTO) throws BusinessException {
        ArticleDTO articleDTO = articleService.addArticle(articleAddDTO);
        return ResponseDTO.buildSuccess("添加文章成功", articleDTO);
    }
    
    @DeleteMapping("/article/{aid}")
    public void deleteArticle(@PathVariable Long aid){
        // TODO: 2017/9/28
    }
}
