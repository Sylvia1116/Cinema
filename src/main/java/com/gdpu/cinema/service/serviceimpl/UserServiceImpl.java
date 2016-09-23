package com.gdpu.cinema.service.serviceimpl;

import com.gdpu.cinema.bean.User;
import com.gdpu.cinema.mapper.UserMapper;
import com.gdpu.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kevin on 16/9/22.
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public String userLogin(User user) {
        List<User> users = userMapper.userLogin(user);
        String message = "";
        if (users.size() <= 0) {
            message = "登录失败";
        } else message = "登录成功";
        return message;
    }
}
