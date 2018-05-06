package org.zj.tieba.bean;

import java.util.List;
import java.util.Map;

public class ReplyVo {
    List<Map.Entry<Reply,List<Reply>>> replays;

    public ReplyVo() {
    }

    public List<Map.Entry<Reply, List<Reply>>> getReplays() {
        return replays;
    }

    public void setReplays(List<Map.Entry<Reply, List<Reply>>> replays) {
        this.replays = replays;
    }

    public ReplyVo(List<Map.Entry<Reply, List<Reply>>> replays) {
        this.replays = replays;
    }
}
