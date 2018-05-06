package org.zj.tieba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.User;
import org.zj.tieba.service.IReplyService;
import org.zj.tieba.service.ITopicService;

import javax.jws.Oneway;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    IReplyService replyService;

    @Autowired
    ITopicService topicService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/{topic_id}")
    public String item(@PathVariable("topic_id")int id){
        int topicId=id;

        request.setAttribute("topic",topicService.getTopic(topicId));
        System.out.println(topicService.getTopic(topicId).getId());
        request.setAttribute("reply_entry_list",replyService.getReplyVoByTopicID(topicId));
        return "item";
    }

    @RequestMapping("/add")
    public String add(){
     String content=request.getParameter("content");
     User user= (User) request.getSession().getAttribute("user");

     if(user==null){
         return "login&register";
     }

     int topicId=Integer.parseInt(request.getParameter("topicId"));
     Reply reply=new Reply(content,user.getId(),topicId,new Date());
     return "redirect:/item/"+topicId;
    }

}
