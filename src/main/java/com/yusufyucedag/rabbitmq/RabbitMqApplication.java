package com.yusufyucedag.rabbitmq;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yusufyucedag.rabbitmq.entity.Notification;
import com.yusufyucedag.rabbitmq.producer.NotificationProducer;

/**
 * 
 * @author Yusuf Yucedag
 * @since 1.0
 * @date Dec 2, 2020
 */

@SpringBootApplication
public class RabbitMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}

	@Bean
	CommandLineRunner createInitialNotifications(NotificationProducer notificationProducer) {
		return (args) -> {

			Notification notification1 = new Notification();
			notification1.setId(UUID.randomUUID().toString());
			notification1.setDate(new Date());
			notification1.setMessage("Message 1");
			notification1.setSeen(Boolean.FALSE);
			notificationProducer.sendToQueue(notification1);

			Notification notification2 = new Notification();
			notification2.setId(UUID.randomUUID().toString());
			notification2.setDate(new Date());
			notification2.setMessage("Message 2");
			notification2.setSeen(Boolean.FALSE);
			notificationProducer.sendToQueue(notification2);

		};
	}

}
