package com.iag.bbscloud.board.controller;

import com.iag.bbscloud.board.service.BoardService;
import com.iag.bbscloud.common.dto.BoardAddDTO;
import com.iag.bbscloud.common.dto.BoardDTO;
import com.iag.bbscloud.common.exception.BusinessException;
import com.iag.bbscloud.common.exception.EntityOperateException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import com.iag.bbscloud.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Objects;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:33
 */
@RestController
@Slf4j
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/{bid}")
    public BoardDTO queryBoardById(@PathVariable BigInteger bid) throws ParameterException{
        if(!Objects.isNull(bid) && StringUtils.isNotBlank(bid.toString())){
            BoardDTO boardDTO = null;
            try {
                boardDTO = boardService.queryBoardById(bid);
            } catch (EntityOperateException e) {
                log.error("[board查询] ID：{} is not exist", bid);
            }
            return boardDTO;
        }else{
            log.error("[参数错误] {} has error", bid);
            throw new ParameterException("", ExceptionEnum.PARAMETER_ERROR);
        }
    }

    @PostMapping("/board")
    public BoardDTO addBoard(@RequestBody BoardAddDTO boardAddDTO) throws EntityOperateException {
        return boardService.addBoard(boardAddDTO);
    }
}
