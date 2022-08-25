package com.exalt.training.task18.kafka;

import com.exalt.training.task18.Trainees.Trainees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    // Define logger to display the received trainee through kafka template
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "TraineesJsonTopic", groupId = "consumerGroupID")
    public void consume(Trainees traineesData){
        logger.info(String.format("Json message recieved: %s", traineesData.toString()));
    }

}
