package com.patterns.singleton;

public class SingleTonMultiThread {
	public static volatile SingleTonMultiThread instance = null;

	private SingleTonMultiThread() {
		throw new UnsupportedOperationException();
	}

	public static SingleTonMultiThread getInstance() {
		SingleTonMultiThread temp = instance;
		if (temp == null) {

			synchronized (SingleTonMultiThread.class) {
				temp = instance;

				if (temp == null) {
					temp = instance = new SingleTonMultiThread();
				}
			}
		}
		return instance;
	}
}
