package org.zj.tieba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zj.tieba.bean.TopicVo;
import org.zj.tieba.service.ITopicService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    ITopicService topicService;

    @Autowired
    HttpServletRequest request;
    @RequestMapping("/index")
    public String index(){

        request.setAttribute("topic_list",topicService.getAllTopicVo());

        for(TopicVo t:topicService.getAllTopicVo()){
            System.out.println(t.getTitle());
        }

        return "index";

    }
}
