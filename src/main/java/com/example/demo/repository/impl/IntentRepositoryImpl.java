package com.example.demo.repository.impl;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;
import com.example.demo.repository.IntentRepository;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class IntentRepositoryImpl implements IntentRepository {
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Message> findByMessage(String messageId) {

        TypedQuery<Message> jpql=entityManager.createNamedQuery("from Message where messageId= :messageId",Message.class);
        jpql.setParameter("messageId",Integer.getInteger(messageId));
        List<Message> result = jpql.getResultList();
        return result;
    }

    @Override
    @Transactional
    public List<IntentMessage> findIntentByMessageId(String messageId) {
        TypedQuery<IntentMessage> jpql=entityManager.createNamedQuery("from IntentMessage where messageId= :messageId",IntentMessage.class);
        jpql.setParameter("messageId",Integer.getInteger(messageId));
        List<IntentMessage> result = jpql.getResultList();
        return result;
    }

    @Override
    @Transactional
    public List<Intent> findIntentByIntentId(String intentId) {
        TypedQuery<Intent> jpql=entityManager.createNamedQuery("from Intent where messageId= :messageId",Intent.class);
        jpql.setParameter("messageId",Integer.getInteger(intentId));
        List<Intent> result = jpql.getResultList();
        return result;
    }

    @Override
    @Transactional
    public List<Reply> findReplyByReplyId(String replyId) {
        TypedQuery<Reply> jpql=entityManager.createNamedQuery("from Reply where messageId= :messageId",Reply.class);
        jpql.setParameter("messageId",Integer.getInteger(replyId));
        List<Reply> result = jpql.getResultList();
        return result;
    }


}
