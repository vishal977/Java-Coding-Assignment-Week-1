package com.purple.assignment;

public class DataHidingAndEncapsulation {

	public static void main(String[] args) {
		
		try {
			System.out.println("Creating rectangle 1...");
			Rectangle rectangle1 = new Rectangle(10.0, 5.0);
			System.out.println("Area of rectangle 1 = " + rectangle1.getArea());
			
			System.out.println("Creating rectangle 2...");
			Rectangle rectangle2 = new Rectangle(1,2); //Length is lesser than breadth, cannot be created.
			rectangle2.getArea();
		}
		catch(InvalidProportionsException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
		finally {
			System.out.println("End of program...");
		}

	}

}

class Rectangle {
	private double length;
	private double breadth;
	
	//Checks if the length is greater than the breadth.
	//This method is unavailable for access from outside this class.
	private void checkDimensions(double length, double breadth) throws InvalidProportionsException {
		if(length < breadth) {
			throw new InvalidProportionsException("Invalid proportions for a rectangle.");
		}
	}
	
	public Rectangle(double l, double b) throws InvalidProportionsException {
		checkDimensions(l,b);
		this.length = l;
		this.breadth = b;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	public double getArea() {
		return length * breadth;
	}
	
	
}

//Custom Exception
class InvalidProportionsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidProportionsException(String message) {
		super(message);
	}
}
