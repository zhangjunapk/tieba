package org.zj.tieba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.tieba.bean.User;
import org.zj.tieba.service.IUserService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    IUserService userService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login")
    public String login(){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User user = userService.checkUser(new User(username, password));
        if(user!=null){
            request.getSession().setMaxInactiveInterval(999999999);
            request.getSession().setAttribute("user",user);
            //login success
        }else{
            request.getSession().setMaxInactiveInterval(999999999);
            userService.addUser(new User(username,password));
            request.getSession().setAttribute("user",new User(username,password));
        }
        return "redirect:/index";
    }

    @RequestMapping("/login_page")
    public String loginPage(){
        return "login&register";
    }

}
