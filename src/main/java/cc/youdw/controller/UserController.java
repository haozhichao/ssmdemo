package cc.youdw.controller;

import cc.youdw.entity.User;
import cc.youdw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by east on 16/9/20.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "getUsers",method = RequestMethod.GET)
    public List<User> getUser(){
        return userService.getUsers();
    }

    @ResponseBody
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public Integer adduser(User user) {
        return userService.addUser(user);
    }
}
