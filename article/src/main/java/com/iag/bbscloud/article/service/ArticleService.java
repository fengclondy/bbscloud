package com.iag.bbscloud.article.service;

import com.iag.bbscloud.common.dto.ArticleAddDTO;
import com.iag.bbscloud.common.dto.ArticleDTO;
import com.iag.bbscloud.common.exception.BusinessException;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 上午11:45
 */
public interface ArticleService {

    ArticleDTO addArticle(ArticleAddDTO articleAddDTO) throws BusinessException;


}
