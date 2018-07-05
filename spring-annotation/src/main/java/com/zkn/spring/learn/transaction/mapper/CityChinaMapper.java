package com.zkn.spring.learn.transaction.mapper;

import com.zkn.spring.learn.transaction.domain.CityChinaDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zkn
 * @date 2018/7/5 22:24
 **/
@Mapper
public interface CityChinaMapper extends BaseMapper<CityChinaDO, Long> {
}
