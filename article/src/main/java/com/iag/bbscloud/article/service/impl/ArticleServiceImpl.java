package com.iag.bbscloud.article.service.impl;

import com.iag.bbscloud.article.model.Article;
import com.iag.bbscloud.article.model.ArticleDetail;
import com.iag.bbscloud.article.model.repository.ArticleDetailRepository;
import com.iag.bbscloud.article.model.repository.ArticleRepository;
import com.iag.bbscloud.article.service.ArticleService;
import com.iag.bbscloud.common.dto.ArticleAddDTO;
import com.iag.bbscloud.common.dto.ArticleDTO;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import com.iag.bbscloud.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.Objects;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 下午12:07
 */
@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private ArticleDetailRepository articleDetailRepository;

    @Override
    public ArticleDTO addArticle(ArticleAddDTO articleAddDTO) throws BusinessException{
        if(Objects.nonNull(articleAddDTO)
                && Objects.nonNull(articleAddDTO.getUid())
                && Objects.nonNull(articleAddDTO.getBid())
                && StringUtils.isNotBlank(articleAddDTO.getTitle())
                && StringUtils.isNotBlank(articleAddDTO.getContext())){
            //1.generate id
            String idUrl = "http://IDCENTER-SERVER/id?bizTag=" + BizTagEnum.AID.getValue();
            Long aid = restTemplate.getForObject(idUrl, Long.class);
            //2.save article
            Article newArticle = new Article(
                    aid,
                    articleAddDTO.getUid(),
                    articleAddDTO.getBid(),
                    articleAddDTO.getTitle()

            );
            newArticle = articleRepository.save(newArticle);

            //3.save article detail
            ArticleDetail articleDetail = new ArticleDetail(
                    aid,
                    articleAddDTO.getUid(),
                    articleAddDTO.getBid(),
                    articleAddDTO.getContext(),
                    newArticle.getCreateTime(),
                    newArticle.getLastModifyTime()
            );
            articleDetailRepository.save(articleDetail);
            return ArticleDTO.build(
                    aid,
                    articleAddDTO.getUid(),
                    articleAddDTO.getBid(),
                    articleAddDTO.getTitle(),
                    articleAddDTO.getContext(),
                    articleDetail.getCreateTime(),
                    articleDetail.getLastModifyTime()
            );
        }else {
            throw new BusinessException("article add parameter error", ExceptionEnum.PARAMETER_ERROR);
        }
    }

    @Override
    public ArticleDTO querySingleArticle(Long aid) throws ParameterException{
        if(Objects.nonNull(aid) && StringUtils.isNotBlank(aid.toString())){
            Article article = articleRepository.findOne(aid);
            ArticleDetail articleDetail = articleDetailRepository.findOne(aid);

            return ArticleDTO.build(
                    aid,
                    article.getUid(),
                    article.getBid(),
                    article.getTitle(),
                    articleDetail.getContext(),
                    article.getCreateTime(),
                    article.getLastModifyTime()
            );
        }else {
            throw new ParameterException("query article parameter error", ExceptionEnum.PARAMETER_ERROR);
        }
    }
}
