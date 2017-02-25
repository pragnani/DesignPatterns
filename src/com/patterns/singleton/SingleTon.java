package com.patterns.singleton;

public class SingleTon {

	public static SingleTon instance = new SingleTon();

	private SingleTon() {
		throw new UnsupportedOperationException();
	}

	public SingleTon getInstance() {
		return instance;
	}

}
