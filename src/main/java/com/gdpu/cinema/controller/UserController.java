package com.gdpu.cinema.controller;

import com.gdpu.cinema.bean.User;
import com.gdpu.cinema.common.JsonResult;
import com.gdpu.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kevin on 16/9/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 返回的是一个json（通过ResponseBody注解）
     *
     * @param user
     * @return Json
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public
    @ResponseBody
    JsonResult userLogin(User user) {
        User user1 = new User();
        user1.setMsg(userService.userLogin(user));
        //这个jsonResult是一个封装好的json对象 你们将你们的bean放进去就好了 像下面那样
        JsonResult jsonResult = new JsonResult(user1);
        return jsonResult;
    }
}
