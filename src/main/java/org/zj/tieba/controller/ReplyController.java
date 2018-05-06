package org.zj.tieba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.service.IReplyService;
import org.zj.tieba.service.ITopicService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    ITopicService topicService;

    @Autowired
    IReplyService replyService;

    @RequestMapping("/addParentReply")
    public String addReply(){
        /**
         *  private String content;
         *     private int userId;//哪个人发的
         *     private int parentId;//父id
         *     private int topicId;//帖子id
         *     private Date createDate;//创建时间
         */

        System.out.println();

        if(request.getSession().getAttribute("user")==null){
            return "login&register";
        }

        String content=request.getParameter("content");
        int userId=Integer.parseInt(request.getParameter("user_id"));
        int topicId=Integer.parseInt(request.getParameter("topic_id"));
        System.out.println("11111111111           "+topicId);

        Reply reply=new Reply();
        reply.setContent(content);
        reply.setCreateDate(new Date());
        reply.setTopicId(topicId);
        reply.setUserId(userId);
        System.out.println(reply.getTopicId()+"           8*********");
        replyService.addParentReply(reply);

        return "redirect:/item/"+topicId;
    }

    @RequestMapping("/addChild")
    public String addChild(){

        if(request.getSession().getAttribute("user")==null){
            return "login&register";
        }
        int userId= (int) request.getSession().getAttribute("user");
        int topicId=Integer.parseInt(request.getParameter("topic_id"));
        int parentId=Integer.parseInt(request.getParameter("parent_id"));
        Reply reply=new Reply();
        reply.setContent(request.getParameter("content"));
        reply.setTopicId(topicId);
        reply.setParentId(parentId);
        reply.setUserId(userId);
        replyService.addReply(reply);
        return "redirect:/item/"+topicId;
    }
}
