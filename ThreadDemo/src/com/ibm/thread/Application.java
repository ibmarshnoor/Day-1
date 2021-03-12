package com.ibm.thread;

public class Application {
    public static void main(String[] args) {
    	Thread t1=new Worker();
    	t1.start();
    	Thread t2=new Worker();
    	t2.start();
    	System.out.println("In main Thread");
    }
}
