package com.exalt.training.task18.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {

    // Define logger to display the message send through kafka template
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    // call kafka template which will used to send message
    // KafkaTemplate <key type , value type>
    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage (String message){
        logger.info(String.format("Message sent %s ",message));
        kafkaTemplate.send("TraineesTopic",message);
    }
}
