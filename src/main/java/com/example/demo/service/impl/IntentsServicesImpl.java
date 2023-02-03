package com.example.demo.service.impl;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;
import com.example.demo.repository.IntentRepository;
import com.example.demo.service.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntentsServicesImpl implements IntentService {

     @Autowired
    IntentRepository intentRepository;

    @Override
    public List<Message> findByMessage(String messageId) {
        return intentRepository.findByMessage(messageId);
    }

    @Override
    public List<IntentMessage> findIntentByMessageId(String messageId) {
        return intentRepository.findIntentByMessageId(messageId);
    }

    @Override
    public List<Intent> findIntentByIntentId(String intentId) {
        return intentRepository.findIntentByIntentId(intentId);
    }

    @Override
    public List<Reply> findReplyByReplyId(String replyId) {
        return intentRepository.findReplyByReplyId(replyId);
    }

    @Override
    public Integer getMaxResult() {
        return intentRepository.getMaxResult();
    }
}
