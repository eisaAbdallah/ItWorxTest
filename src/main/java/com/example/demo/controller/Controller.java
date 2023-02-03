package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import java.util.List;



import static com.example.demo.urls.Urls.INTENTS_MESSAGE;

@RestController
public class Controller {
    List<IntentsModel> intentCollection = new ArrayList<>();

    @Autowired
    IntentService intentService;
    @GetMapping(INTENTS_MESSAGE)
    public List<Reply> getMessage(@RequestBody UserMessage userMessage) {
        intentCollection.add(new IntentsModel("Greeting", 0.81));
        intentCollection.add(new IntentsModel("Delivery status", 0.18));
        intentCollection.add(new IntentsModel("Refund possibility", 0.01));
        List<Message> messages= intentService.findByMessage(userMessage.getMessage());
        List<IntentMessage> messagesIntents=null;
        List<Intent>  Intents=null;
        List<Reply>  replies=null;
        for(Message result :messages){
            messagesIntents=intentService.findIntentByMessageId(result.getMessageId());

      }
        for(IntentMessage result :messagesIntents){
            Intents=intentService.findIntentByIntentId(result.getIntentId());

        }
        for(Intent result :Intents){
            replies=intentService.findReplyByReplyId(result.getReplyId());

        }

        for(IntentsModel result :intentCollection){
            float maxResult=intentService.getMaxResult();

           if(result.getConfidence()==maxResult){

               return replies;
           }



        }
        Reply reply=new Reply();
        replies=new ArrayList<>();
        reply.setReplyMessage("Chat bot didnt find Result for Your Request");
        replies.add(reply);
        return replies;

    }

}
