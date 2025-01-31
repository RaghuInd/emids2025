package com.demo.thread;

public class TaskRunnable implements Runnable {

	@Override
	public  void run() {
		// TODO Auto-generated method stub

		display();
	}

	public  void display() {
		
		synchronized (this) {
			for (int i = 0; i < 10; i++)
				System.out.println("Task:" + i + "Thread:" + Thread.currentThread().getName());

		}
			
		
		
	
	}

}
