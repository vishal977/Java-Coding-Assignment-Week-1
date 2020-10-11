package com.purple.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckForKey {

	public static void main(String[] args) {
		Map<Integer, String> trainees = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
		System.out.println("Select operation: \n 1.Add values\n 2. Search with key. \n 3.Quit");
		int choice = scanner.nextInt();
		if(choice == 3)
			break;
		
		switch(choice) {
		 	case 1: 
		 		System.out.println("Enter values in the format key:value\n Type STOP to stop adding.");
		 		while(true) {
		 			String input = scanner.next();
		 			if(input.equalsIgnoreCase("stop")) {
		 				break;
		 			}
		 			String[] inputSplit = input.split(":");
		 			int id = Integer.parseInt(inputSplit[0]);
		 			String name = inputSplit[1];
		 			trainees.put(id, name);
		 		}
		 		break;
		 	case 2: 
		 		System.out.println("Enter key to search for");
		 		int key = scanner.nextInt();
		 		if(trainees.containsKey(key))
		 			System.out.println("Key is present");
		 		else 
		 			System.out.println("Key not found.");
		 		
		 		break;
		 	default:
		 		System.out.println("Invalid choice");
		}
		}
		scanner.close();
	}

}
