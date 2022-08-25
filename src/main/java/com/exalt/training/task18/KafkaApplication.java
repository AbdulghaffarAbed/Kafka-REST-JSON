package com.exalt.training.task18;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;


/**
 * this process required three cmd to execute one of the following command respictively (only one for each):
 * first command to start zookeeper that's used to manage and coordinate kafka broker:
 * .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
 * second command used to start kafka:
 * .\bin\windows\kafka-server-start.bat .\config\server.properties
 * third command to display kafka console and messages using our predefine topic ("TraineesTopic")
 * .\bin\windows\kafka-console-consumer.bat --topic TraineesTopic --from-beginning --bootstrap-server DESKTOP-DGBJSI9.exalt.ps:9092
 * For JsonTopic:
 * .\bin\windows\kafka-console-consumer.bat --topic TraineesJsonTopic --from-beginning --bootstrap-server DESKTOP-DGBJSI9.exalt.ps:9092
 **/

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("TraineesTopic","hello Trainees with kafka");
        };
    }
}
