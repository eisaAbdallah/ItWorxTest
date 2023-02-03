package com.example.demo.model;

import javax.persistence.*;

@Entity
public class IntentMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intetnt_message_id", nullable = false)
    private int intetntMessageId;
    @Column(name = "message_id", nullable = false)
    private int messageId;
    @Column(name = "intent_id", nullable = false)
    private int intentId;
    @Column(name = "confidence", nullable = false)
    private int confidence;
    public int getIntetntMessageId() {
        return intetntMessageId;
    }

    public void setIntetntMessageId(int intetntMessageId) {
        this.intetntMessageId = intetntMessageId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getIntentId() {
        return intentId;
    }

    public void setIntentId(int intentId) {
        this.intentId = intentId;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
}
