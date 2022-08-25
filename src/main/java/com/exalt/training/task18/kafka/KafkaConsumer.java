package com.exalt.training.task18.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    // Define logger to display the received message through kafka template
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "TraineesTopic", groupId = "consumerGroupID")
    public void consume(String message){
        logger.info(String.format("Message received: %s ",message));
    }
}
