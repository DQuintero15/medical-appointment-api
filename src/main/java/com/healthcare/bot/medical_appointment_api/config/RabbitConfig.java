package com.healthcare.bot.medical_appointment_api.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue dataThermsQueue() {
        return new Queue("data.therms.queue", false);
    }
}
