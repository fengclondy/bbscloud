package com.iag.bbscloud.board.model.repository;

import com.iag.bbscloud.board.model.Board;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:09
 */
public interface BoardRepository extends CrudRepository<Board, BigInteger>{

    Board queryFirstByName(String name);
}
