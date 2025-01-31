package com.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		{
			int i =100;
			{
				int j=200;
				System.out.println("i:"+i);
			}
			//System.out.println("j:"+j);
			
		}
		CustomThread customThread = new CustomThread();
		customThread.start();
		CustomThread customThread2 = new CustomThread();
		customThread2.start();
		
		TaskRunnable task = new TaskRunnable();
		TaskRunnable2 task2 = new TaskRunnable2("task2");
		
		TaskRunnable2 task3 = new TaskRunnable2("task3");
		
		Thread thread = new Thread(task);
		thread.start();
		
		Thread thread2 = new Thread(task);
		thread2.start();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(task);
		executor.execute(task2);
		executor.execute(task3);
		executor.shutdown();
		System.out.println("main thread :"+Thread.currentThread().getName());
	}

}
