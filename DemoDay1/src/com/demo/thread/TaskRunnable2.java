package com.demo.thread;

public class TaskRunnable2 implements Runnable {

	String name;

	public TaskRunnable2(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		display();
	}

	public void display() {

		synchronized (this) {
			for (int i = 10; i < 20; i++)
				System.out.println(name + ":" + i + "Thread:" + Thread.currentThread().getName());

		}

	}

}
