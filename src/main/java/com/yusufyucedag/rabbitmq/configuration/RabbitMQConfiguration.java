package com.yusufyucedag.rabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Yusuf Yucedag
 * @since 1.0
 * @date Dec 2, 2020
 */

@Configuration
public class RabbitMQConfiguration {
	
	@Value("${rabbitMq.queque.name}")
	private String queueName;
	
	@Value("${rabbitMq.exchange.name}")
	private String routingName;
	
	@Value("${rabbitMq.routing.name}")
	private String exchangeName;
	
	@Bean
	public Queue queue() {
		return new Queue(queueName,true);
	}

	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange(exchangeName);
	}

	@Bean
	public Binding binding(final Queue queue, final DirectExchange directExchange) {
		return BindingBuilder.bind(queue).to(directExchange).with(routingName);
	}
	

}
