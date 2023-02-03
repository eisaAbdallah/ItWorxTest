package com.example.demo.service;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;

import java.util.List;

public interface IntentService {
    List<Message> findByMessage(String messageId);
    List<IntentMessage> findIntentByMessageId(int messageId);
    List<Intent> findIntentByIntentId(int intentId);
    List<Reply> findReplyByReplyId(int replyId);

    float getMaxResult();
}
