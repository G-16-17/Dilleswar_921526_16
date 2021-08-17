package com.solid_principles;

public class Order implements IPhoneOrder{

	@Override
	public void processOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println("Order Accepted "+modelName);
	}

}
