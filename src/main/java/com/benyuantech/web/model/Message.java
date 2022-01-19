package com.benyuantech.web.model;

import lombok.Data;

import java.util.Date;
@Data
public class Message {
    private Integer id;
    private String ip;
    private Date createdTime;
    private String name;
    private String contract;
    private String message;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", createdTime=" + createdTime +
                ", name='" + name + '\'' +
                ", contract='" + contract + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
