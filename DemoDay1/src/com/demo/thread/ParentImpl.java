package com.demo.thread;

public class ParentImpl implements Parent{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Parent impl of a()");
	}

	@Override
	public void search(String key) {
		System.out.println("new default search:"+key);
		
	}
}
