package assignments.lab2_questions;

import java.util.Scanner;

public class Lab3_question5 {

	public static void main(String[] args) {

	/*
	Write a program that computes the tax and tip on a restaurant bill. The
	program should ask the user to enter the charge for the meal. The tax should
	be 6.75 percent of the meal charge. The tip should be 20 percent of the total
	after adding tax. Display the meal charge, tax amount, tip amount, and total
	bill on the screen.
	*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the charge for the meal: ");
		double mealCharge=scan.nextDouble();
		
		double tax= mealCharge*0.0675;
		double tip=(tax+mealCharge)*0.2;
		double total= tax+tip+mealCharge;
		
		System.out.println("The meal charge: "+mealCharge);
		System.out.println("The tax amount: " + tax);
		System.out.println("The tip amount: " + tip);
		System.out.println("Total bill: " + total);
		

	}

}
