package com.mediator_pattern;

public interface IUser {
	
	public void ReceiveMessage(String msg);
	public void SendMessage(String name, String msg);
}
