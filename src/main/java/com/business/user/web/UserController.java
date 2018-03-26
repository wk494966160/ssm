package com.business.user.web;

import com.business.base.contorller.BaseController;
import com.business.user.entity.User;
import com.business.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wk on 2018/3/23.
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("list")
    public String login(User user, Model model){
        List<User> userList = userService.getAllList();
        model.addAttribute("userList",userList);
        return "user/userList";
    }
}
