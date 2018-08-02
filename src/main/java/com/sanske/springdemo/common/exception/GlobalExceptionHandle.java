package com.sanske.springdemo.common.exception;

import com.sanske.springdemo.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author sanske
 * @date 2018/8/2 下午3:41
 **/
@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(BioSanException.class)
    @ResponseBody
    public Result handleCustemException(BioSanException e){
        return Result.fail(e.getMessage());
    }

    @ExceptionHandler(BioSanRuntimeException.class)
    @ResponseBody
    public Result handleCustemException(BioSanRuntimeException e){
        return Result.fail(e.getMessage());
    }

}
