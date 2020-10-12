package com.hjy.hrms.entity;

import lombok.Data;

/**
 * @author HJY
 * @date 2020/10/9 11:07
 * @Description 服务器消息实体
 */
@Data
public class Message {

    /**
     * 未找到
     */
    public static final int NOT_FIND = 404;

    /**
     * 服务器错误
     */
    public static final int SERVICE_ERROR = 500;

    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 消息代码
     */
    private int code;
    /**
     * 消息内容
     */
    private String msg;
    /**
     * 发生该消息的URL
     */
    private String url;

    /**
     * 添加消息
     *
     * @param msg 消息
     */
    public void addMsg(String msg) {
        if (this.msg == null) {
            this.msg = msg;
        } else {
            this.msg += msg;
        }
    }
}
