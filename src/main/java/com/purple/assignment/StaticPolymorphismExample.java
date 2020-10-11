package com.purple.assignment;

public class StaticPolymorphismExample {

	public static void main(String[] args) {
		
		StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
		String[] stringArray = {"Hello", "World"};
		
		//Though all three methods have the same method name, the third one is invoked as the parameter is a String array.
		staticPolymorphism.printArray(stringArray);
	}

}


class StaticPolymorphism {
	
	public void printArray(int[] arr) {
		System.out.println("Printing the integer array...");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
	}
	
	public void printArray(char[] arr) {
		System.out.println("Printing the character array...\n");
		for(char x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
	}
	
	public void printArray(String[] arr) {
		System.out.println("Printing the String array...\n");
		for(String s: arr) {
			System.out.print(s + " ");
		}
		System.out.println("");
	}
	
}
