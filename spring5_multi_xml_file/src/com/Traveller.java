package com;

public class Traveller implements journey{

	Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void startjourney() {
		System.out.println();
		v.move();
	}
	
}
