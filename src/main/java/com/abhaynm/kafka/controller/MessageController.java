package com.abhaynm.kafka.controller;

import com.abhaynm.kafka.payload.Student;
import com.abhaynm.kafka.producer.KafkaJsonProducer;
import com.abhaynm.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestBody String message){
        kafkaProducer.sendMessage(message);
    }

    @PostMapping("/json")
    @ResponseStatus(HttpStatus.OK)
    public void sendJsonMessage(@RequestBody Student student){
        kafkaJsonProducer.sendMessage(student);
    }
}
