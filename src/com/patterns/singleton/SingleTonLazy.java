package com.patterns.singleton;

public class SingleTonLazy {

	public static SingleTonLazy instance = null;

	private SingleTonLazy() {
		throw new UnsupportedOperationException();
	}

	public static SingleTonLazy getInstance() {
		if (instance == null) {
			instance = new SingleTonLazy();
		}
		return instance;
	}
}
