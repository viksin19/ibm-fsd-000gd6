package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class RabbitMqConsumer {

	private static final String QUEUE = "products-queue";
	
	@RabbitListener(queues = QUEUE)
	public void recieveMessage(Product product) {
		System.out.println("Recieved Message From Products-Queue"+product);
	}
}
