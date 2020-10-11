package com.purple.assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class ShallowCopy {

	public static void main(String[] args) {
		
		HashMap<Integer, String> trainees = new HashMap<>();
		trainees.put(100, "Jake");
		trainees.put(101, "Amy");
		trainees.put(102, "Holt");
		trainees.put(103, "Gina");
		
		System.out.println("Trainee hashmap: ");
		for(Entry<Integer, String> e : trainees.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());			
		}
		
		HashMap<Integer, String> traineeCopy = (HashMap<Integer, String>) trainees.clone();
		System.out.println("Shallow copy of Trainee hashmap: ");
		for(Entry<Integer, String> e : traineeCopy.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());			
		}
	}

}
