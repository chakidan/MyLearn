package com.my.learn.factory;

public class FlowerFactory {

	public Flower createFlower(String criteria) {
		System.out.println("This is creating Flower");
		if (criteria.equals("Tulip"))
			return new Tulip();
		else if (criteria.equals("SunFlower"))
			return new SunFlower();

		return null;
	}

}
