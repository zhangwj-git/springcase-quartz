package com.zhang.springcase.quartz.common;

public enum ResponseCode {

    SUCCESS(0,"成功[OK]"),
    UNKNOW_ERROR(99999,"未知错误[UNKNOW ERROR]");

    private Integer code;

    private String msg;

    ResponseCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
