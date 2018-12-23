package com.fiveqian.singleton;

/**
 * 单例设计模式--懒汉式
 * @author 小伍
 *
 */
public class Singleton {
	
	/**
	 * 私有属性加private防止外面直接调用，加static给getInstence直接调用
	 */
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	/**
	 * 实例方法要加static饰符，以便调用
	 * @return
	 */
	public static Singleton getInstence() {
		if (singleton==null) {
			//防止多线程同时访问，加锁排队
			synchronized (Singleton.class) {
				//防止多线程，二次判断
				if (singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
	
	

	
}
