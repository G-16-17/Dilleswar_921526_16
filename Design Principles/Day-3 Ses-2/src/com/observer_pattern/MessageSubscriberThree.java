package com.observer_pattern;

public class MessageSubscriberThree implements Observer

{

	@Override
     public void update(Message m) {

	System.out.println("MessageSubscriberThree :: " + m.getMessageContent());

	}

}
