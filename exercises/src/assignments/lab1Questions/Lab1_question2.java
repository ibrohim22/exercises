package assignments.lab1Questions;

public class Lab1_question2 {

	public static void main(String[] args) {

		/*
		  The number 6 is a truly great number. Write a method that accepts num1 and
		  num2, prints true if either one is 6. Or if their sum or difference is 6.
		  love6(6, 4) → true 
		  love6(4, 5) → false 
		  love6(1, 5) → true 
		  love6(12, 6)->true
		 */

		love6(6, 4);
		love6(10, 4);
		love6(5, 1);
		love6(5,4);

	}

	public static void love6(int num1, int num2) {

		boolean lovely = (num1 + num2 == 6) || (num1 == 6) || (num2 == 6) || (num1 - num2 == 6);

		System.out.println(lovely);

	}

}
