package com.hjy.hrms.exception.json;

/**
 * @author HJY
 * @date 2020/10/12 10:46
 * @Description Json异常
 */
public class JsonException extends Exception {

    /**
     * 错误代码
     */
    private int code;

    public JsonException(String exceptionMessage, int code) {
        super(exceptionMessage);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
