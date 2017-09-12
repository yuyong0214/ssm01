
package com.yong.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.model.User;
import com.yong.service.UserService;

@Controller
public class UserController
{
    @Resource
    private UserService userService;

    private User user;

    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    public String getUserById(HttpServletRequest request, Model model)
    {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findById(userId);
        model.addAttribute("user", user);
        return "findUser";
    }

    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

}
