
package com.yong.controller;

import java.util.List;

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

    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }

    /**
     * 方法描述：添加用户信息页面
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:12:59
     * @return
     */
    @RequestMapping("/add")
    public String addUserUI()
    {
        return "add";
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    public String getUserById(HttpServletRequest request, Model model)
    {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findById(userId);
        model.addAttribute("user", user);
        return "findUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(User user, Model model)
    {
        this.userService.save(user);
        return "listUser";
    }

    @RequestMapping("/list")
    public String findUsers(Model model)
    {
        List<User> list = userService.query();
        model.addAttribute("users", list);
        return "listUser";
    }
}
