package assignments.lab2_questions;

import java.util.Scanner;

public class Lab3_question4 {

	public static void main(String[] args) {
		
	// Write a program that asks user for the number of males and the number of
	// females registered in a class. The program should display the percentage of
	// males and females in the class.

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of males in the class");
		int males = scan.nextInt();
		
		System.out.print("Enter number of females in the class");
		int females = scan.nextInt();
		
		double all=females+males;
		
		double femalePercentage = females*100/all;
		double malePercentage = males*100/all;
		
		
		System.out.println("Males in the class: "+malePercentage +"%");
		System.out.println("Females in the class: "+femalePercentage+"%");
		
		

	}

}
