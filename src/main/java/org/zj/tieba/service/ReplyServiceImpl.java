package org.zj.tieba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.tieba.bean.Reply;
import org.zj.tieba.bean.ReplyVo;
import org.zj.tieba.dao.IDeleteDao;
import org.zj.tieba.dao.IInsertDao;
import org.zj.tieba.dao.IQueryDao;
import org.zj.tieba.dao.IUpdateDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ReplyServiceImpl implements IReplyService {

    @Autowired
    IQueryDao queryDao;

    @Autowired
    IDeleteDao deleteDao;

    @Autowired
    IInsertDao insertDao;

    @Autowired
    IUpdateDao updateDao;


    @Override
    public boolean addParentReply(Reply reply) {
        return insertDao.insertParentReply(reply);
    }

    @Override
    public boolean addReply(Reply reply) {
        return insertDao.insertReply(reply);
    }

    @Override
    public boolean deleteReply(int id) {
        return deleteDao.deleteReplyByPrimaryKey(id);
    }

    @Override
    public List<Map.Entry<Reply,List<Reply>>> getReplyVoByTopicID(int id) {
        List<Map.Entry<Reply,List<Reply>>> result=new ArrayList<>();
        for(Reply reply:getParentReply(id)){
            result.add(new Map.Entry<Reply, List<Reply>>() {
                @Override
                public Reply getKey() {
                    return reply;
                }

                @Override
                public List<Reply> getValue() {
                    return getReplyByParentId(reply.getId());
                }

                @Override
                public List<Reply> setValue(List<Reply> value) {
                    return getReplyByParentId(reply.getId());
                }
            });

        }

        return result;
    }

    @Override
    public List<Reply> getReplyByParentId(int id) {
        return queryDao.selectAllReplyByParentId(id);
    }

    @Override
    public List<Reply> getParentReply(int topicId) {
        return queryDao.selectAllParentReply(topicId);
    }
}
