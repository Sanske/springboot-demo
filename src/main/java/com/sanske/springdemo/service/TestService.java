package com.sanske.springdemo.service;

import com.sanske.springdemo.dto.User;

import java.util.List;

/**
 * @author sanske
 * @date 2018/8/1 上午11:28
 **/
public interface TestService {
   List<User> getUser(String id);
}
