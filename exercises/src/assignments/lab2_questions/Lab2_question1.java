package assignments.lab2_questions;
import java.util.Scanner;
public class Lab2_question1 {

	public static void main(String[] args) {

	/*
	Write a program with a loop that lets the user enter a series of integer
  	numbers. After all the numbers have been entered, the program should display
	the largest and smallest numbers entered.
	*/
		int num;
		int lowest, largest;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		
		num= sc.nextInt();
		lowest=num;
		largest=num;

		
		do {
		
			
			System.out.print("Enter your next number: ");
			
			num= sc.nextInt();
			if(num<lowest) {
				lowest=num;
			}else if(num>largest) {
				largest=num;
			}
			
			
			System.out.print("Do you want to enter another number ? ");
			num= sc.nextInt();
			if(num==0) {
				
				break;
			}else if( num==1) {
				continue;
			}
			
			
		}while (true);
		
		
		System.out.println("The smallest number is: "+lowest);
		System.out.println("The largest number is: "+ largest);
		
		
		
	}

}
