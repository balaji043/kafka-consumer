package bam.developers.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KafkaExample",groupId = "group_id")
    public void consume(String message){
        System.out.println(message);
    }

    @KafkaListener(topics = "KafkaJsonExample",groupId = "group_json",containerFactory = "userKafkaListenerContainerFactory")
    public void consumeUser(User user){
        System.out.println(user.toString());
    }
}
