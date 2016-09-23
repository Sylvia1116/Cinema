package com.gdpu.cinema.mapper;

import com.gdpu.cinema.bean.User;

import java.util.List;

/**
 *  Created by Kevin on 16/9/22.
 */
public interface UserMapper {
    List<User> userLogin(User user);
}
