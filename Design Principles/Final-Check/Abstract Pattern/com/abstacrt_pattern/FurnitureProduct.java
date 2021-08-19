package com.abstacrt_pattern;

public class FurnitureProduct extends Order{

	public FurnitureProduct(Channel channel) {
		super(channel, ProductType.FURNITURE);
		processOrder();
	}
	
	@Override
	void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Processing furniture product order");
	}

}
