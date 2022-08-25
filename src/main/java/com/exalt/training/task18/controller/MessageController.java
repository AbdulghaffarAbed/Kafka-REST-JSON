package com.exalt.training.task18.controller;

import com.exalt.training.task18.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/trainees")
public class MessageController {
    @Autowired
    private  KafkaProducer kafkaProducer;

    @GetMapping
    public void hello(){
        System.out.println("Hello");
    }
    // http:localhost:8080/api/kafka/trainees/publish?message=Hi Kafka
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
