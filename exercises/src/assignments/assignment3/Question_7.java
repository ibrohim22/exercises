package assignments.assignment3;

public class Question_7 {

	public static void main(String[] args) {

		/*
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output 
		 * Price in cents : 95
		 * Your change is 0 quarters, 0 dimes, and 1 nickles
		 */
 
		int itemPrice=95;
		int changeQuarters=(100-itemPrice)/25;
		int changeDimes=(100-itemPrice)%25/10;
		int changeNickles=(100-itemPrice)%25%10/5;
		
		
		System.out.println("Price in cents : "+itemPrice);
		System.out.println("Your change is " + changeQuarters + " quarters, " + changeDimes + " dimes, and "+changeNickles+ " nickles");
		
	
		
		
	}

}
