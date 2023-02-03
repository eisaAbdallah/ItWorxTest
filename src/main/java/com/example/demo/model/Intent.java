package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Intent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intent_id", nullable = false)
    private int intentId;
    @Column(name = "reply_id", nullable = false)
    private int replyId;

    public int getIntentId() {
        return intentId;
    }

    public void setIntentId(int intentId) {
        this.intentId = intentId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }
}
