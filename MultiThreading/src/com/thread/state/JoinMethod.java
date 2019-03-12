package com.thread.state;

public class JoinMethod implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("This is thread B- "+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		JoinMethod target = new JoinMethod();
		Thread b = new Thread(target);
		b.start();
		b.join();
		
		for(int i=0;i<10;i++) {
			//Thread.currentThread().join();
			System.out.println("This is thread A-"+i);
		}

	}

}
