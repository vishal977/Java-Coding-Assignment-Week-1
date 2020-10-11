package com.purple.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(1784);
		numbers.add(456);
		numbers.add(658);
		numbers.add(164);
		numbers.add(7984);
		numbers.add(1345);
		
		numbers = sortList(numbers);
		System.out.println(numbers);
		

	}
	
	static List<Integer> sortList(List<Integer> inputList) {
		List<Integer> ascending = new ArrayList<>();
		List<Integer> descending = new ArrayList<>();
		
		int middleIndex = inputList.size()/2;
		System.out.println("Middle index = " + middleIndex);
		
		for(int i = 0; i < middleIndex; i++) {
			ascending.add(inputList.get(i));
		}
		for(int i = middleIndex; i < inputList.size(); i++) {
			descending.add(inputList.get(i));
		}
		
		Collections.sort(ascending);
		Collections.sort(descending);
		Collections.reverse(descending);
		
		ascending.addAll(descending);
		return ascending;
	}

}
