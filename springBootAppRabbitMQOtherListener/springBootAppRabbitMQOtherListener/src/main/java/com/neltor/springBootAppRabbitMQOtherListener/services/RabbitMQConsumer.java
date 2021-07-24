package com.neltor.springBootAppRabbitMQOtherListener.services;

import java.util.logging.Logger;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.neltor.springBootAppRabbitMQOtherListener.models.Employee;

@Component
public class RabbitMQConsumer {

	
	public static final Logger LOGGER = Logger.getLogger(RabbitMQConsumer.class.getName());
	
	@RabbitListener(queues = "${config.rabbitmq.queue}")
	public void receivedMessage(Employee employee) {
		LOGGER.info("Received message from RabbitMQ: " + employee);
	}
	
}
