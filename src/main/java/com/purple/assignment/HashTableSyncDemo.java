package com.purple.assignment;

import java.util.Hashtable;

public class HashTableSyncDemo extends Thread {
	
	static Hashtable<Long, Long> trainees = new Hashtable<Long, Long>();

	public static void main(String[] args) {
		HashTableSyncDemo ht = new HashTableSyncDemo();
		HashTableSyncDemo ht2 = new HashTableSyncDemo();
		ht.start();
		ht2.start();
		
	}
	
	public void run() {
		trainees.put(Math.round(Math.random()*1000), Math.round(Math.random()*10000));
		System.out.println("Thread: "+ Thread.currentThread().getId() +" Added a new record. Updated Hashtable: " + trainees);
	}

}

