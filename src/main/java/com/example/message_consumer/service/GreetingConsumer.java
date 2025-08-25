package com.example.message_consumer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GreetingConsumer {
    @KafkaListener(topics = "${app.topic-name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message) {
        System.out.println("📥 Consumed message: " + message);
    }
}
