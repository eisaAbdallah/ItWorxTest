package com.example.demo.model;

import javax.persistence.*;

@Entity
public class IntentMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intetnt_message_id", nullable = false)
    private int intetntMessageId;
    @Column(name = "message_id", nullable = false)
    private int id;
    @Column(name = "intent_id", nullable = false)
    private int intentId;
    @Column(name = "confidence", nullable = false)
    private float confidence;
    public int getIntetntMessageId() {
        return intetntMessageId;
    }

    public void setIntetntMessageId(int intetntMessageId) {
        this.intetntMessageId = intetntMessageId;
    }

    public int getMessageId() {
        return id;
    }

    public void setMessageId(int messageId) {
        this.id = messageId;
    }

    public int getIntentId() {
        return intentId;
    }

    public void setIntentId(int intentId) {
        this.intentId = intentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getConfidence() {
        return confidence;
    }

    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }
}
