package com.observer_pattern;

public class MessageSubscriberOne implements Observer

{

	@Override
	public void update(Message m) {
	
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

	}
}
