package com.threads;

import com.patterns.builder.Registration;

public class VolatileExample {
	static volatile  int i = 0;

	public static void main(String[] args) {
		new Thread(new MyRunnable1()).start();
		new Thread(new MyRunnable2()).start();
		Registration build2 = new Registration.Builder("bali","password").build();
		Registration build = new Registration.Builder("bali","password")
		.withEmail("bali@gmail.com")
		.build();
		Registration build3 = new Registration.Builder("bali","password")
		.withEmail("bali@gmail.com")
		.withAddress("hyderabad")
		.build();
	}

	private static class MyRunnable1 implements Runnable {

		public void run() {
			System.out.println("Started Thread 1");
			int k=i;
			while (i < 5) {
				i=k++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	private static class MyRunnable2 implements Runnable {

		public void run() {
			System.out.println("Started Thread 2");
			int k = i;
			while (k < 5) {
				if (k != i) {
					System.out.println(k);
					k = i;
				}
			}

		}

	}

}
