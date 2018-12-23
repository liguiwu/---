package com.fiveqian.test;

import com.fiveqian.singleton.Singleton;

public class Test {

	public static void main(String[] args) {
		Singleton singleton1=Singleton.getInstence();
		Singleton singleton2=Singleton.getInstence();
		System.out.println(singleton1==singleton2);
	}
}
