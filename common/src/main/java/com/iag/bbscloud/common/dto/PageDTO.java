package com.iag.bbscloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by beishan on 2017/9/28.
 */
@Data
@AllArgsConstructor
public class PageDTO<T> {
    private int                     total;
    private int                     offset;
    private int                     limit;
    private List<T>            data;
}
