package org.zj.tieba.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.zj.tieba.bean.Topic;
import org.zj.tieba.bean.User;

public interface IUpdateDao {

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Update("update user set username=#{username},password=#{password}")
    boolean updateUser(User user);

    /**
     * 更新帖子
     * @param topic
     * @return
     */
    @Update("update topic set title=#{title},content=#{content}")
    boolean updateTopic(Topic topic);


    /**
     * 更新指定用户的权限
     * @param id
     * @param permission
     * @return
     */
    @Update("update user set permission=#{permission} where id=#{id}")
    boolean updateUserPermission(@Param("id") int id,@Param("permission") String permission);
}
