package com.example.demo.repository;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IntentRepository   {

List<Message> findByMessage(String messageId);
    List<IntentMessage> findIntentByMessageId(Integer messageId);
    List<Intent> findIntentByIntentId(int intentId);
    List<Reply> findReplyByReplyId(int replyId);

    float getMaxResult();

}
