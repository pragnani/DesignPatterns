package com.patterns.singleton;

public class SingletonBestWay1 {
	private SingletonBestWay1() {
		throw new UnsupportedOperationException();
	}

	private static class SingletonHolder {
		public static SingletonBestWay1 Instance = new SingletonBestWay1();
	}

	public static SingletonBestWay1 getInstance() {
		return SingletonHolder.Instance;
	}

}
