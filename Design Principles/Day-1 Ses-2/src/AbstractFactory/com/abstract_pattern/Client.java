package com.abstract_pattern;

public class Client {

	public void doSomeClientJob(String company) {

		Tire tire = FactoryMaker.getFactory(company).makeTire();
		System.out.println(tire.getTireModel());

		HeadLight light = FactoryMaker.getFactory(company).makeHeadLight();
		System.out.println(light.getHeadLightModel());
	}
}