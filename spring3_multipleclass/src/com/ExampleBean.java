package com;

public class ExampleBean {

	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}
	
	public void show1() {
		System.out.println(db);
		db.m1();
	}
}
