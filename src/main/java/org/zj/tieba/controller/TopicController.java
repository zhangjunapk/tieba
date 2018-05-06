package org.zj.tieba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.User;
import org.zj.tieba.service.ITopicService;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    ITopicService topicService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpServletResponse response;

    @RequestMapping("/add")
    public String add(){
        User user= (User) request.getSession().getAttribute("user");

        if(user==null){
            return "login&register";
        }

        String title=request.getParameter("title");
        String content=request.getParameter("content");


        topicService.addTopic(new Topic(title,content,user.getId(),new Date()));
        return "redirect:/index";
    }

    @RequestMapping("/delete")
    public String delete(){

        if(request.getSession().getAttribute("user")==null){
            return "login&register";
        }
        User user= (User) request.getSession().getAttribute("user");
        int topicId = Integer.parseInt(request.getParameter("topic_id"));
        if(user.getId()==topicService.getUseridByTopicId(topicId)||user.getPermission().equals("管理员") || user.getPermission().equals("超级用户")) {
            topicService.deleteTopic(topicId);
        }
        return "redirect:/index";
    }
}
