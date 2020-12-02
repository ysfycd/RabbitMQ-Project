package com.yusufyucedag.rabbitmq.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.yusufyucedag.rabbitmq.entity.Notification;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Yusuf Yucedag
 * @since 1.0
 * @date Dec 2, 2020
 */

@Service
@RequiredArgsConstructor
public class NotificationProducer {
	
	private final RabbitTemplate rabbitTemplate;
	
	private final Queue queque;
	
	public void sendToQueue(Notification notification) {
		System.out.println("Notification Sent : " + notification);
		rabbitTemplate.convertAndSend(queque.getActualName(),notification);

	}
}
