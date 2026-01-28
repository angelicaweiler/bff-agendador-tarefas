package com.javanauta.bffagendadortarefas.infrastructure.message.producer;

import com.javanauta.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.javanauta.bffagendadortarefas.infrastructure.message.config.RabbitMQConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailProducer {

    private final RabbitTemplate rabbitTemplate;

    public void enviarEmail(TarefasDTOResponse dtoResponse){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_EMAIL,
                RabbitMQConfig.ROUTING_KEY,
                dtoResponse);
    }
}
