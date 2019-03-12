package com.thread.state;

public class SleepProgram implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			try {
				if (i % 10 == 0)
					System.out.println(i + " My name is: " + Thread.currentThread().getName());
				else
					System.out.println(Thread.currentThread().getName() + "-" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		SleepProgram target = new SleepProgram();
		Thread thread = new Thread(target);
		thread.setName("Counting Thread");
		thread.start();

	}

}
