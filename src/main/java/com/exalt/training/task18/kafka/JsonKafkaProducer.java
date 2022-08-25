package com.exalt.training.task18.kafka;

import com.exalt.training.task18.Trainees.Trainees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    // Define logger to display the message send through kafka template
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaProducer.class);

    // Define a reference for kafka template to use it for send trainees object

    @Autowired
    private KafkaTemplate<String, Trainees> kafkaTemplate;

    /**
     * Build a message of trainees objects to send it through kafka using kafka template
     * @param traineeData represent Trainee object information
     */


    public void sendMessage(Trainees traineeData){

        logger.info(String.format("Message sent -> %s", traineeData.toString()));

        Message<Trainees> message = MessageBuilder
                .withPayload(traineeData)
                .setHeader(KafkaHeaders.TOPIC, "TraineesJsonTopic")
                .build();

        kafkaTemplate.send(message);
    }
}
