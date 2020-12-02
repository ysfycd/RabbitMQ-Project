package com.yusufyucedag.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.yusufyucedag.rabbitmq.entity.Notification;

/**
 * 
 * @author Yusuf Yucedag
 * @since 1.0
 * @date Dec 2, 2020
 */

@Service
public class NotificationListener {

	@RabbitListener(queues = {"${rabbitMq.queque.name}"})
	public void handleMessage(Notification notification) {
		System.out.println(notification.toString());

	}
}
