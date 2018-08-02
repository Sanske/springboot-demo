package com.sanske.springdemo.controller;

import com.sanske.springdemo.common.exception.BioSanRuntimeException;
import com.sanske.springdemo.dto.User;
import com.sanske.springdemo.common.result.Result;
import com.sanske.springdemo.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sanske
 * @date 2018/8/1 上午9:30
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LogManager.getLogger(TestController.class);
    @Autowired
    TestService testService;

    @RequestMapping(value = "/helloGet", method = RequestMethod.GET)
    public String helloGet(String name) {
        return "hi, " + name;
    }

    @RequestMapping(value = "/helloPost", method = RequestMethod.POST)
    public String helloPost(String name) {
        return "hi" + name;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Result getUser(String id) {
//        PageHelper.startPage(0, 1);
        try {
            logger.info("test");
            List<User> data = testService.getUser(id);
//        PageInfo<User> dataInfo = new PageInfo<>(data);
//        System.out.println("data " + dataInfo);
//        return Result.success(data);
//          return Result.fail("测试错误");
            return Result.success();
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new BioSanRuntimeException("测试异常");
        }

    }

}

