package com.zkn.spring.learn.transaction.mapper;

import com.zkn.spring.learn.transaction.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zkn
 * @date 2018/7/4 23:57
 **/
@Mapper
public interface UserMapper extends BaseMapper<UserDO, Long> {
    
}
