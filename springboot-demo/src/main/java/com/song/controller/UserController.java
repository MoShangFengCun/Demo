package com.song.controller;

import com.song.service.UserService;
import com.song.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 600601 on 2018/1/29.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private  UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        if (null == name) {
            System.out.println("参数为空");
        }
        User user =userService.findUserByName(name);
        if (null != user) {
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        }else {
            return "null";
        }
    }
}
