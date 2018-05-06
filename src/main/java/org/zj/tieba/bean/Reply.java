package org.zj.tieba.bean;

import java.util.Date;

public class Reply {
    private int id;
    private String content;
    private int userId;//哪个人发的
    private int parentId;//父id
    private int topicId;//帖子id
    private Date createDate;//创建时间

    public Reply(String content, int userId, int topicId, Date createDate) {
        this.content = content;
        this.userId = userId;
        this.topicId = topicId;
        this.createDate = createDate;
    }

    public Reply(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Reply(int id, String content, int userId, int parentId, int topicId, Date createDate) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.parentId = parentId;
        this.topicId = topicId;
        this.createDate = createDate;
    }
}
