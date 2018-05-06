package org.zj.tieba.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.User;

import java.util.Date;
import java.util.List;

public interface IQueryDao {


    @Select("select user_id from topic where id=#{topicId}")
    int selectUserIdByTopicId(@Param("topicId")int topicId);

    @Select("select id from topic where user_id=#{userId} order by id desc limit 1")
    int selectLastTopicIdByUserId(@Param("userId")int userId);

    @Select("select * from topic where id=#{id}")
    Topic selectTopicByPrimaryKey(@Param("id") int id);

    @Select("select * from reply where parent_id is null and topic_id=#{id}")
    List<Reply> selectAllParentReply(@Param("id") int topicId);

    /**
     * 获得所有帖子
     * @return
     */
    @Select("select * from topic")
    List<Topic> selectAllTopic();

    /**
     * 根据帖子ID来获得所有回复(所有父回复)
     * @param topicId
     * @return
     */
    @Select("select * from reply where topic_id=#{topicId}")
    List<Reply> selectAllReply(int topicId);

    /**
     * 获得回复的子回复
     * @param id
     * @return
     */
    @Select("select * from reply where parent_id=#{id}")
    List<Reply> selectAllReplyByParentId(int id);

    @Select("select * from reply where topic_id=#{id} order by create_date desc limit 1")
    Reply selectLastReply(int id);

    @Select("select count(1) from reply where topic_id =#{id}")
    int selectCommentCount(@Param("id") int topicId);


    @Select("select * from user where id=#{id}")
    User selectUserById(@Param("id") int id);

    @Select("select * from user where username=#{username} and password=#{password}")
    User selectUser(String username,String password);

}
