package com.iag.bbscloud.board.service.impl;

import com.iag.bbscloud.board.model.Board;
import com.iag.bbscloud.board.model.repository.BoardRepository;
import com.iag.bbscloud.board.service.BoardService;
import com.iag.bbscloud.common.date.DateUtils;
import com.iag.bbscloud.common.dto.AccountDTO;
import com.iag.bbscloud.common.dto.BoardAddDTO;
import com.iag.bbscloud.common.dto.BoardDTO;
import com.iag.bbscloud.common.enums.BizTagEnum;
import com.iag.bbscloud.common.exception.EntityOperateException;
import com.iag.bbscloud.common.exception.ExceptionEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.Date;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/9/26 下午4:15
 */
@Service
@Slf4j
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${api.account.url}")
    private String accountServerUrl;
    @Value("${api.idcenter.url}")
    private String idcenterServerUrl;

    @Override
    public BoardDTO queryBoardById(BigInteger bid) throws EntityOperateException {

        Board existBoard = boardRepository.findOne(bid);
        if(existBoard == null){
            log.error("[查询board error] id:{} board not exist", bid);
            throw new EntityOperateException("board is not exist", ExceptionEnum.BOARD_NOST_EXIST);
        }
        return BoardDTO.build(
                existBoard.getBid(),
                existBoard.getUid(),
                existBoard.getName(),
                existBoard.getCreateTime(),
                existBoard.getLastModifyTime());
    }

    @Override
    public BoardDTO addBoard(BoardAddDTO boardAddDTO) throws EntityOperateException {
        AccountDTO accountDTO = restTemplate.getForObject(accountServerUrl + "/account/" + boardAddDTO.getUid(), AccountDTO.class);
        if(accountDTO == null){
            log.error("[board add error] uid not exist");
            throw new EntityOperateException("board add error, uid not exist", ExceptionEnum.BOARD_ADD_ERROR);
        }
        Board existBoard = boardRepository.queryFirstByName(boardAddDTO.getName());
        if(existBoard != null){
            log.error("[board add error] board {} exist", boardAddDTO.getName());
            throw new EntityOperateException("board add error, uid already exist", ExceptionEnum.BOARD_ADD_ERROR);
        }
        String gbid = restTemplate.getForObject(idcenterServerUrl + "/id?bizTag=" + BizTagEnum.BID.getValue(), String.class);
        Date now = DateUtils.getNow();
        existBoard = boardRepository.save(
                new Board(new BigInteger(gbid, 10),
                boardAddDTO.getUid(), boardAddDTO.getName(), now, now));
        return BoardDTO.build(existBoard.getBid(),
                existBoard.getUid(),
                existBoard.getName(),
                existBoard.getCreateTime(),
                existBoard.getLastModifyTime());
    }
}
