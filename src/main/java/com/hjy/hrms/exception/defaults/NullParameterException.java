package com.hjy.hrms.exception.defaults;

/**
 * @author HJY
 * @date 2020/10/12 10:44
 * @Description 空参数异常
 */
public class NullParameterException extends DefaultException {

    /**
     * 异常信息
     */
    private String exceptionMessage;

    public NullParameterException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
