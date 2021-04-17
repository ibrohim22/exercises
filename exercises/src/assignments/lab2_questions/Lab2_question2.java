package assignments.lab2_questions;

import java.util.Scanner;

public class Lab2_question2 {

	public static void main(String[] args) {

	/*
	A bag of cookies holds 40 cookies. The calorie information on the bag claims
	that there are 10 serving in the bag and that a serving equals 300 calories.
	write a program that lets the user enter the number of cookies he or she
  	actually ate and then reports the number of total calories consumed.
	*/
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter number of cookies eaten: ");
		
		int cookiesEaten = scan.nextInt();
		 
		int caloriesEachCookie=10*300/40;
		
		int caloriesConsumed=cookiesEaten*caloriesEachCookie;
		
		System.out.println("Number of total calories consumed: "+ caloriesConsumed);
		
		
		scan.close();
		
		
		
	}

}
