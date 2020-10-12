package com.hjy.hrms.exception.defaults;

/**
 * @author HJY
 * @date 2020/10/12 10:42
 * @Description 无ID异常
 */
public class NoSuchIdException extends DefaultException {

    /**
     * 异常信息
     */
    private String exceptionMessage;

    public NoSuchIdException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
