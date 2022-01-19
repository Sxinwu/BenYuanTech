package com.benyuantech.web.mapper;

import com.benyuantech.web.model.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    int insert(Message message);// 添加留言
    int insertSelective(Message message);// 添加留言
}