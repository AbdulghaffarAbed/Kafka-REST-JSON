package com.exalt.training.task18.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    /**
     * Create topic inside the which will contains our partitions
     * We can define a limit number  of partitions by using .partitions(partitions number)
     *
     * @return topic used in the middle between consumer and producer as a shared access place
     */

    @Bean
    public NewTopic traineesTopic() {
        return TopicBuilder.name("TraineesTopic").build();
    }

    @Bean
    public NewTopic traineesJsonTopic() {
        return TopicBuilder.name("TraineesJsonTopic").build();
    }
}
