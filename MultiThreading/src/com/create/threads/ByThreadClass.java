package com.create.threads;

public class ByThreadClass extends Thread {
	
	public void run() {//Running State
		System.out.println("Hi This is User Thread and my name is: "+getName());
	}//Dead state
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("HI I am a thread and my name is: "+currentThread().getName());
		Thread.sleep(1000);
		ByThreadClass userThread = new ByThreadClass();//New State
		userThread.setName("UserThread-1");
		userThread.start();//Runnable State
	}

}
