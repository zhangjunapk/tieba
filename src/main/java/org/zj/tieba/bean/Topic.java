package org.zj.tieba.bean;

import java.util.Date;

public class Topic {
    private int id;
    private String title;//标题
    private String content;//内容
    private int userId;//用户id
    private Date createDate;//创建时间

    public Topic(String title, String content, int userId, Date createDate) {
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.createDate = createDate;
    }

    public Topic(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Topic(int id, String title, String content, int userId, Date createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", createDate=" + createDate +
                '}';
    }
}
