package com.yucong.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {

	
	public static void main(String[] args) {
		
		int initialCapacity = 1;
		float loadFactor = 1L;
		int concurrencyLevel = 1;
		
		ConcurrentHashMap<String, Object> map = 
				new ConcurrentHashMap<>(initialCapacity, loadFactor, concurrencyLevel);
		
		
		
		
		
		
		System.out.println(map);
		
		
	}
	
	
}
