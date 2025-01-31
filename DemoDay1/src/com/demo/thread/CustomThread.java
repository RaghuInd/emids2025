package com.demo.thread;

public class CustomThread extends Thread{

	public void run() {
		System.out.println("thread is running.."+Thread.currentThread().getName());
	}
	
}
