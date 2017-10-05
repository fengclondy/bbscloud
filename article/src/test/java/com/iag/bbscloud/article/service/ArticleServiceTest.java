package com.iag.bbscloud.article.service;

import com.iag.bbscloud.article.ArticleApplicationTest;
import com.iag.bbscloud.common.dto.ArticleAddDTO;
import com.iag.bbscloud.common.dto.ArticleDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/28 下午2:51
 */
public class ArticleServiceTest extends ArticleApplicationTest {
    @Autowired
    private ArticleService articleService;

    @Test
    public void testAddArticle() throws BusinessException {
        ArticleAddDTO articleAddDTO = new ArticleAddDTO(
                123L,
                456L,
                "title",
                "context..."
        );

        ArticleDTO articleDTO = articleService.addArticle(articleAddDTO);
        System.out.println(articleDTO);
    }
}
