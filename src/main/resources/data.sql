INSERT INTO message (message_id, message) VALUES (1, 'Hello');
INSERT INTO message (message_id, message) VALUES (2, 'Thanks, bye!');
INSERT INTO message (message_id, message) VALUES (3, 'Yeah');
INSERT INTO message (message_id, message) VALUES (4, 'No thanks!');
INSERT INTO message (message_id, message) VALUES (5, 'Brilliant! Thanks!');
INSERT INTO message (message_id, message) VALUES (6, 'Can I talk to a human?');
INSERT INTO message (message_id, message) VALUES (7, 'I cant sign in');
INSERT INTO message (message_id, message) VALUES (8, 'Where do I open a new account?');

INSERT INTO  reply (reply_id, reply_message) VALUES (1, 'how can i help you');
INSERT INTO reply (reply_id, reply_message) VALUES (2, 'Goodbye, have a nice day!');
INSERT INTO reply (reply_id, reply_message) VALUES (3, 'Great!');
INSERT INTO reply (reply_id, reply_message) VALUES (4, 'Alright, please let me know if I can help you with anything else!');
INSERT INTO reply (reply_id, reply_message) VALUES (5, 'It was a pleasure to be of help :)');
INSERT INTO reply (reply_id, reply_message) VALUES (6, 'Let me transfer you to the first available agent.');
INSERT INTO reply (reply_id, reply_message) VALUES (7, 'Oh no! Please give me your email and I will fix it.');
INSERT INTO reply (reply_id, reply_message) VALUES (8, 'Please follow these instructions \"LINK\" to open a new account.');




INSERT INTO  intent_message (id, message_id_intent,intent_id,confidence) VALUES (1, 1,1,0.81);
INSERT INTO intent_message (id, message_id_intent,intent_id,confidence) VALUES (2, 2,2,0.18);
INSERT INTO intent_message (id, message_id_intent,intent_id,confidence) VALUES (3, 3,3,0.01);
INSERT INTO  intent_message (id, message_id_intent,intent_id,confidence) VALUES (4, 4,4,0.18);
INSERT INTO intent_message (id, message_id_intent,intent_id,confidence) VALUES (5, 5,5,0.01);
INSERT INTO intent_message (id, message_id_intent,intent_id,confidence) VALUES (6, 6,6,0.18);
INSERT INTO  intent_message (id, message_id_intent,intent_id,confidence) VALUES (7, 7,7,0.01);
INSERT INTO intent_message (id, message_id_intent,intent_id,confidence) VALUES (8, 8,8,0.18);



INSERT INTO  intent (intent_id, reply_id) VALUES (1, 1);
INSERT INTO intent (intent_id, reply_id) VALUES (2, 2);
INSERT INTO intent (intent_id, reply_id) VALUES (3, 3);
INSERT INTO  intent (intent_id, reply_id) VALUES (4, 4);
INSERT INTO intent (intent_id, reply_id) VALUES (5, 5);
INSERT INTO intent (intent_id, reply_id) VALUES (6, 6);
INSERT INTO  intent (intent_id, reply_id) VALUES (7, 7);
INSERT INTO intent (intent_id, reply_id) VALUES (8, 8);
