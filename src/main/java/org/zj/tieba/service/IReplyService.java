package org.zj.tieba.service;

import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.ReplyVo;

import java.util.List;
import java.util.Map;

public interface IReplyService {

    boolean addParentReply(Reply reply);

    /**
     * 添加一个回复
     * @param reply
     * @return
     */
    boolean addReply(Reply reply);

    /**
     * 删除指定id的回复
     * @param id
     * @return
     */
    boolean deleteReply(int id);

    /**
     * 根据帖子id来获得回复
     * @param id
     * @return
     */
    List<Map.Entry<Reply,List<Reply>>> getReplyVoByTopicID(int id);

    /**
     * 获得指定回复的子回复
     * @param id
     * @return
     */
    List<Reply> getReplyByParentId(int id);

    /**
     * get all parent reply by topic id
     * @param topicId
     * @return
     */
    List<Reply> getParentReply(int topicId);
}
