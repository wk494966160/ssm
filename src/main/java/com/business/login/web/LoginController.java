package com.business.login.web;

import com.business.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wk on 2018/3/23.
 */
@Controller
public class LoginController {


    /**
     * 跳转默认前端页面
     * @return
     */
    @RequestMapping("")
    public String index(HttpServletRequest request){
        return "login/index";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request){
        return "login/login";
    }
}
