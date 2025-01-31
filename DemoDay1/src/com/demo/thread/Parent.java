package com.demo.thread;

public interface Parent {

	public void a();
	
	public default void search(String key) {
		
		System.out.println("default search:"+key);
	}
	
}
