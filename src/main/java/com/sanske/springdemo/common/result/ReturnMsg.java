package com.sanske.springdemo.common.result;

/**
 * @author sanske
 * @date 2018/8/2 下午3:51
 **/
public enum ReturnMsg {
    SUCCESS(200, "success"),
    FAIL(400, ""),
    SERVER_ERROR(500, "服务器内部错误");
    private int code;
    private String msg;

    ReturnMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

