package com.observer_pattern;

public interface INotificationObserver {
	
	String name="";
	public void OnServerDown();
	public String getName();
}
