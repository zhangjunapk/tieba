package org.zj.tieba.dao;

import org.apache.ibatis.annotations.Insert;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.User;

public interface IInsertDao {

    /**
     * 插入一个帖子
     * @param topic
     * @return
     */
    @Insert("insert into topic(title,content,user_id,create_date) values(#{title},#{content},#{userId},#{createDate})")
    boolean insertTopic(Topic topic);

    /**
     * 插入一个回复
     * @param reply
     * @return
     */
    @Insert("insert into reply(content,user_id,parent_id,topic_id,create_date) values(#{content},#{userId},#{parentId},#{topicId},#{createDate})")
    boolean insertReply(Reply reply);


    @Insert("insert into reply(content,user_id,topic_id,create_date) values(#{content},#{userId},#{topicId},#{createDate})")
    boolean insertParentReply(Reply reply);

    /**
     * 插入一个用户
     * @param user
     * @return
     */
    @Insert("insert into user(username,password) values(#{userName},#{password})")
    boolean insertUser(User user);
}
