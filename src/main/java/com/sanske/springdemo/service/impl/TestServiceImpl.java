package com.sanske.springdemo.service.impl;

import com.sanske.springdemo.dao.UserDao;
import com.sanske.springdemo.dto.User;
import com.sanske.springdemo.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sanske
 * @date 2018/8/1 上午11:34
 **/
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> getUser(String id) {
      return userDao.getUser(id);
    }
}
