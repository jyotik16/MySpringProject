package com;

public class SampleBean {
	private DemoBean db;

	public void setDb(DemoBean db) {
		this.db = db;
	}
	
	public void show() {
		System.out.println(db);
		db.m1();
	}
}
