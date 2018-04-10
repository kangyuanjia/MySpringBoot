package com.kyj.demo.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue HelloQueue() {
        return new Queue("hello");
    }
    
    @Bean
    public Queue KyjQueue() {
    	return new Queue("kyj");
    }
    
    @Bean
    public Queue ObjectQueue() {
    	return new Queue("object");
    }

}
