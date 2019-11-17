package com.yucong.concurrenthashmap;

import java.util.HashMap;
import java.util.UUID;

public class TestHashMap {

	/**
	 * 在jdk8下测试并没有发现执行出现异常
	 */
	public static void main(String[] args) throws InterruptedException {
		
		final HashMap<String,String> map = new HashMap<>(2);
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							map.put(UUID.randomUUID().toString(), "");
							
						}
					},"ftf" + i).start();
				}
			}
		},"ftf");
		t.start();
		t.join();
	}
	
	
}
