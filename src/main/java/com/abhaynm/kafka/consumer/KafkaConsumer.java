package com.abhaynm.kafka.consumer;

import com.abhaynm.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
//    @KafkaListener(topics = "abhay",groupId = "myGroup")
//    public void consumeMsg(String msg){
//        log.info(String.format("consuming the message from abhay Topic:: %s",msg));
//    }
    @KafkaListener(topics = "abhay",groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(String.format("Consuming the message from abhay Topic :: %s",student));
    }

}
