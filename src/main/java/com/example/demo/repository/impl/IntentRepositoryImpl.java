package com.example.demo.repository.impl;

import com.example.demo.model.Intent;
import com.example.demo.model.IntentMessage;
import com.example.demo.model.Message;
import com.example.demo.model.Reply;
import com.example.demo.repository.IntentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class IntentRepositoryImpl implements IntentRepository {
    @Autowired
    EntityManager entityManager;

    @Autowired
    JdbcTemplate jdbcTemplate;

    List<IntentMessage> intentMessages;
    @Override
    @Transactional
    public List<Message> findByMessage(String messageId) {

        TypedQuery<Message> jpql=entityManager.createQuery("from Message where message =: message",Message.class);
        jpql.setParameter("message",messageId);
        List<Message> result = jpql.getResultList();
        return result;
    }

    @Override
    public List<IntentMessage> findIntentByMessageId(Integer messageId) {
        intentMessages=  this.jdbcTemplate.query("select * from INTENT_MESSAGE where MESSAGE_ID_INTENT=?",new RowMapper<IntentMessage>(){
            @Override
            public IntentMessage mapRow(ResultSet rs, int rownumber) throws SQLException {
                IntentMessage e=new IntentMessage();
                e.setIntentId(rs.getInt("intent_id"));
                e.setConfidence(rs.getFloat("confidence"));
                return e;
            }
        },messageId);
        return intentMessages;
    }

    

    @Override
    @Transactional
    public List<Intent> findIntentByIntentId(int intentId) {
        TypedQuery<Intent> jpql=entityManager.createQuery("from Intent where intentId =: intentid",Intent.class);
        jpql.setParameter("intentid", intentId);
        List<Intent> result = jpql.getResultList();
        return result;
    }

    @Override
    @Transactional
    public List<Reply> findReplyByReplyId(int replyId) {
        TypedQuery<Reply> jpql=entityManager.createQuery("from Reply where replyId =: replyid",Reply.class);
        jpql.setParameter("replyid",replyId);
        List<Reply> result = jpql.getResultList();
        return result;
    }

    @Override
    public float getMaxResult() {
        return this.jdbcTemplate.queryForObject("SELECT   MAX(confidence) AS max  FROM Intent_Message",float.class);
    }


}
