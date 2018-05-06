package org.zj.tieba.service;

import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.TopicVo;

import java.util.List;

public interface ITopicService {

    int getUseridByTopicId(int topiId);

    int getLastTopicId(int userId);

    Topic getTopic(int id);

    /**
     * 添加帖子
     * @param topic
     * @return
     */
    boolean addTopic(Topic topic);

    /**
     * 删除帖子
     * @param id
     * @return
     */
    boolean deleteTopic(int id);

    /**
     * 更新帖子
     * @param topic
     * @return
     */
    boolean updateTopic(Topic topic);

    /**
     * 获得所有帖子
     * @return
     */
    List<TopicVo> getAllTopicVo();


    List<Topic> selectAllTopic();
}
