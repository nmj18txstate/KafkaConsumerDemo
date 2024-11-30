package com.example.kafkaconsumerdemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "test-topic", groupId = "my-consumer-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
