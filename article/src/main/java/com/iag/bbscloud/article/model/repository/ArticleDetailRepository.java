package com.iag.bbscloud.article.model.repository;

import com.iag.bbscloud.article.model.ArticleDetail;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午3:38
 */
public interface ArticleDetailRepository extends CrudRepository<ArticleDetail, Long> {
}
