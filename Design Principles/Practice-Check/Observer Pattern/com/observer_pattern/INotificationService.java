package com.observer_pattern;

public interface INotificationService {

	public void addSubscriber(INotificationObserver observer);
	public void removeSubscriber(INotificationObserver observer);
	public void notifySubscriber();
}
