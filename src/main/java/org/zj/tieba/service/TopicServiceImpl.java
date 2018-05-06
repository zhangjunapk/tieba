package org.zj.tieba.service;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.TopicVo;
import org.zj.tieba.dao.IDeleteDao;
import org.zj.tieba.dao.IInsertDao;
import org.zj.tieba.dao.IQueryDao;
import org.zj.tieba.dao.IUpdateDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImpl implements ITopicService {

    @Autowired
    IQueryDao queryDao;

    @Autowired
    IDeleteDao deleteDao;

    @Autowired
    IInsertDao insertDao;

    @Autowired
    IUpdateDao updateDao;

    @Autowired
    IUserService userService;

    @Override
    public int getUseridByTopicId(int topiId) {
        return queryDao.selectUserIdByTopicId(topiId);
    }

    @Override
    public int getLastTopicId(int userId) {
        return queryDao.selectLastTopicIdByUserId(userId);
    }

    @Override
    public Topic getTopic(int id) {
        return queryDao.selectTopicByPrimaryKey(id);
    }

    @Override
    public boolean addTopic(Topic topic) {
        return insertDao.insertTopic(topic);
    }

    @Override
    public boolean deleteTopic(int id) {
        return deleteDao.deleteTopicByPrimaryKey(id);
    }

    @Override
    public boolean updateTopic(Topic topic) {
        return updateDao.updateTopic(topic);
    }

    @Override
    public List<TopicVo> getAllTopicVo() {
        List<TopicVo> result=new ArrayList<>();
        for(Topic topic:selectAllTopic()){
            TopicVo topicVo=new TopicVo();
            topicVo.setTitle(topic.getTitle());
            topicVo.setCommentCount(queryDao.selectCommentCount(topic.getId()));
            topicVo.setContent(topic.getContent());

            if(userService.getUserById(topic.getUserId())!=null){

                topicVo.setWriterName(userService.getUserById(topic.getUserId()).getUserName());
            }
            Reply reply = queryDao.selectLastReply(topic.getId());

            System.out.println(topic.getUserId()+"userid");

            if(reply!=null) {
                System.out.println(reply.getUserId()+"   0000000000");
                topicVo.setLastReplyDate(reply.getCreateDate());
                if(userService.getUserById(reply.getUserId())!=null){
                topicVo.setLastReplyUserName(userService.getUserById(reply.getUserId()).getUserName());
                }
            }
            topicVo.setId(topic.getId());
            result.add(topicVo);
        }
        return result;
    }

    @Override
    public List<Topic> selectAllTopic() {
        return queryDao.selectAllTopic();
    }
}
