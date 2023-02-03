DROP TABLE IF EXISTS message;
CREATE TABLE message(message_id INT PRIMARY KEY,message VARCHAR(250) NOT NULL  );

DROP TABLE IF EXISTS intent_message;
CREATE TABLE intent_message(id INT PRIMARY KEY,message_id_intent INT  NOT NULL,intent_id INT NOT NULL, confidence FLOAT NOT NULL,FOREIGN KEY (intent_id) REFERENCES intent(intent_id),FOREIGN KEY (message_id_intent) REFERENCES message(message_id) );
DROP TABLE IF EXISTS reply;
CREATE TABLE reply(reply_id INT PRIMARY KEY,reply_message VARCHAR(250) NOT NULL ) ;

DROP TABLE IF EXISTS intent;
CREATE TABLE intent(intent_id INT PRIMARY KEY,reply_id INT NOT NULL ,FOREIGN KEY (reply_id) REFERENCES reply(reply_id));










