package org.zj.tieba.dao;

import org.apache.ibatis.annotations.Delete;

public interface IDeleteDao {

    /**
     * 删除指定ID的帖子
     * @param id
     * @return
     */
    @Delete("delete from topic where id=#{id}")
    boolean deleteTopicByPrimaryKey(int id);

    /**
     * 删除指定ID的回复
     * @param id
     * @return
     */
    @Delete("delete from reply where id=#{id}")
    boolean deleteReplyByPrimaryKey(int id);


    /**
     * 删除指定的ID的用户
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    boolean deleteUser(int id);
}
