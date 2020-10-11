package com.purple.assignment;

public class Cistern {
	
	//Converting height to decimeter.
	static double height = 20 * 3.048;
	
	//Converting diameter to radius in decimeter.
	static double radius = (5 * 3.048)/2;
	
	//Calculate volume of the tank.
	static double volume = Math.PI * radius * radius * height;
	
	public static void main(String[] args) {
		// 11112 litres
		System.out.println(volume);
	}
	
	

}
