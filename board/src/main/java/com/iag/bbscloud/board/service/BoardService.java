package com.iag.bbscloud.board.service;

import com.iag.bbscloud.common.dto.BoardAddDTO;
import com.iag.bbscloud.common.dto.BoardDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.EntityOperateException;

import java.math.BigInteger;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:09
 */
public interface BoardService {
    BoardDTO queryBoardById(BigInteger bid) throws EntityOperateException;

    BoardDTO addBoard(BoardAddDTO boardAddDTO) throws EntityOperateException;
}
