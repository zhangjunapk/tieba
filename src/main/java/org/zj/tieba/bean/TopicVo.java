package org.zj.tieba.bean;

import java.util.Date;

public class TopicVo  {
    private int id;
    private String title;
    private int commentCount;
    private String writerName;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Date lastReplyDate;
    private String lastReplyUserName;

    public TopicVo(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastReplyDate() {
        return lastReplyDate;
    }

    public void setLastReplyDate(Date lastReplyDate) {
        this.lastReplyDate = lastReplyDate;
    }

    public String getLastReplyUserName() {
        return lastReplyUserName;
    }

    public void setLastReplyUserName(String lastReplyUserName) {
        this.lastReplyUserName = lastReplyUserName;
    }

    public TopicVo(String title, int commentCount, String writerName, String content, Date lastReplyDate, String lastReplyUserName) {
        this.title = title;
        this.commentCount = commentCount;
        this.writerName = writerName;
        this.content = content;
        this.lastReplyDate = lastReplyDate;
        this.lastReplyUserName = lastReplyUserName;
    }
}
