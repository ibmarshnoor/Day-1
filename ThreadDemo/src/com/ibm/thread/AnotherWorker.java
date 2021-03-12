package com.ibm.thread;

public class AnotherWorker implements Runnable{
	
	public void run() {
		System.out.println("In worker thread"+Thread.currentThread());
	}

}
