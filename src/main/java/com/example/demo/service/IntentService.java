package com.example.demo.service;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;

import java.util.List;

public interface IntentService {
    List<Message> findByMessage(String messageId);
    List<IntentMessage> findIntentByMessageId(String messageId);
    List<Intent> findIntentByIntentId(String intentId);
    List<Reply> findReplyByReplyId(String replyId);

Integer getMaxResult();
}
