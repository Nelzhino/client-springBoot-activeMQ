package com.neltor.springBootAppRabbitMQListener.services;

import java.util.logging.Logger;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQListener implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(RabbitMQListener.class.getName());
	
	@Override
	public void onMessage(Message message) {
		LOGGER.info("Consuming message - " + new String(message.getBody()));
	}

}
