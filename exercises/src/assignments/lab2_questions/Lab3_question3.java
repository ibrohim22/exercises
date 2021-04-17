package assignments.lab2_questions;

import java.util.Scanner;

public class Lab3_question3 {

	public static void main(String[] args) {

		// Write a program that asks the user for a positive nonzero
		// integer value. The program should use a loop to get the
		// sum of all the integers from 1 up to the number entered.

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a positive nonzero integer value: ");
		int num = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = i + sum;
		}

		System.out.println("Sum of all the integer numbers from 1 to "
		+ num + " equals: " + sum);

		scan.close();

	}

}
