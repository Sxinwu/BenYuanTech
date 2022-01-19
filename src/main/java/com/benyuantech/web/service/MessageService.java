package com.benyuantech.web.service;

import com.benyuantech.web.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    boolean addMessage(Message message);//添加留言
}
