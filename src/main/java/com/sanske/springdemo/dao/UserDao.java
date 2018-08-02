package com.sanske.springdemo.dao;

import com.sanske.springdemo.dto.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sanske
 * @date 2018/8/1 上午11:36
 **/
@Mapper
public interface UserDao {
  List<User> getUser(@Param(value="id")String id);
}
