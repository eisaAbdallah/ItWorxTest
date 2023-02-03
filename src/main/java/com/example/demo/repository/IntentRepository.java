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
    List<IntentMessage> findIntentByMessageId(String messageId);
    List<Intent> findIntentByIntentId(String intentId);
    List<Reply> findReplyByReplyId(String replyId);

    Integer getMaxResult();

}
