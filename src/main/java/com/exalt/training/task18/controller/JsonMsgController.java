package com.exalt.training.task18.controller;

import com.exalt.training.task18.Trainees.Trainees;
import com.exalt.training.task18.kafka.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka/trainees")
public class JsonMsgController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    //
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Trainees traineeData){
        jsonKafkaProducer.sendMessage(traineeData);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
