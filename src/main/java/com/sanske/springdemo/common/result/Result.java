package com.sanske.springdemo.common.result;


/**
 * @author sanske
 * @date 2018/8/2 上午11:09
 **/
public class Result {
    private int code;
    private String msg;
    private Object data;

    public Result(Object data) {
       this.code = ReturnMsg.SUCCESS.getCode();
       this.msg = ReturnMsg.SUCCESS.getMsg();
       this.data = data;
    }

    public Result(int code, String msg) {
      this.code = code;
      this.msg = msg;
    }

    public static Result success() {
       return new Result(ReturnMsg.SUCCESS.getCode(), ReturnMsg.SUCCESS.getMsg());
    }
    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result fail(String msg) {
      return new Result(ReturnMsg.FAIL.getCode(), msg);
    }

    public static Result error() {
      return new Result(ReturnMsg.SERVER_ERROR.getCode(), ReturnMsg.SERVER_ERROR.getMsg());
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
